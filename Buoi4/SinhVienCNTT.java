package Buoi4;

import java.util.Scanner;

import Buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String tkhoan;
	private String mkhau;
	private String email;
	
	// ham xay dung khong doi so
	public SinhVienCNTT() {
		super();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}
	// ham xay dung sao chep
	public SinhVienCNTT(SinhVienCNTT n) {
		super(n);
		tkhoan = new String(n.tkhoan);
		mkhau = new String(n.mkhau);
		email = new String(n.email);
	}
	// nhap thong tin
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapSinhVien();
		System.out.print("Nhap tai khoan: ");
		tkhoan = sc.nextLine();
		System.out.print("Nhap mat khau: ");
		mkhau = sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
	}
	// nap de phuong thuc toString
	public String toString() {
		return super.toString()+ "- tai khoan: " + tkhoan + "- email: " + email;
	}
	// doi mat khau
	public void doiMatkhau(String newpass) {
		Scanner sc = new Scanner(System.in);
		mkhau = sc.nextLine();
	}
	// lay dia chi email
	public String getEmail() {
		return email;
	}
}
