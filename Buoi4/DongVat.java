package Buoi4;

import java.util.Scanner;

public class DongVat {
	private String giong;
	private String maulong;
	private float canang;
	
	// ham xay dung khong doi so
	public DongVat() {
		giong = new String();
		maulong = new String();
		canang = 0;
	}
	// ham xay dung co doi so
	public DongVat(String giong1, String maulong1, String canang1) {
		giong = new String(giong1);
		maulong = new String(maulong1);
		canang = 0;
	}
	// ham xay dung sao chep
	public DongVat(DongVat n) {
		giong = new String(n.giong);
		maulong = new String(n.maulong);
		canang = 0;
	}
	public void tiengkeu() {
		
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten giong: ");
		giong = sc.nextLine();
		System.out.print("Nhap mau long/mau da: ");
		maulong = sc.nextLine();
		System.out.print("Nhap can nang: ");
		canang = sc.nextFloat();
	}
	public void hienThi() {
		System.out.println("giong: " + giong + "- mau long: " + maulong + "- can nang: " + maulong);
	}
}
