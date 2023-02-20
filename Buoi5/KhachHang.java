package Buoi5;

import java.util.Scanner;

public class KhachHang {
	private String maSo, hoTen, diaChi;
	
	public KhachHang() {
		maSo = new String();
		hoTen = new String();
		diaChi = new String();
	}
	public KhachHang(KhachHang n) {
		maSo = new String(n.maSo);
		hoTen = new String(n.hoTen);
		diaChi = new String(n.diaChi);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so khach hang: ");
		maSo = sc.nextLine();
		System.out.print("Nhap ho ten khach hang: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap dia chi khach hang: ");
		diaChi = sc.next();
	}
	
	public void in() {
		System.out.println("Ma khach hang: " + maSo + "\nHo ten khach hang: " + hoTen + "\nDia chi: " + diaChi);
	}
	public String toString() {
		return "Ma khach hang: " + maSo + "\nHo ten khach hang: " + hoTen + "\nDia chi: " + diaChi;
	}
}
