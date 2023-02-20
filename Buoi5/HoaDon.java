package Buoi5;

import java.util.Scanner;

public class HoaDon {
	private String maHoadon, tieude, hoTen;
	private MyDate ngLap;
	private KhachHang k;
	
	public HoaDon() {
		maHoadon = new String();
		tieude = new String();
//		hoTen = new String();
		ngLap = new MyDate();
		k = new KhachHang();
	}
	
	public HoaDon(HoaDon n) {
		maHoadon = new String(n.maHoadon);
		tieude = new String(n.tieude);
//		hoTen = new String(n.hoTen);
		ngLap = new MyDate(n.ngLap);
		k = new KhachHang(n.k);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hoa don: ");
		maHoadon = sc.nextLine();
		System.out.print("Nhap tieu de: ");
		tieude = sc.nextLine();
//		System.out.print("Nhap ho ten: ");
//		hoTen = sc.nextLine();
		System.out.print("Ngay lap hoa don: ");
		ngLap.nhap();
		k.nhap();
	}
	
	public void in() {
		System.out.print("\nMa hoa don: " + maHoadon + "\nTieu de: " + tieude );
		ngLap.in();
		k.in();
	}
	
}
