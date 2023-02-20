package Buoi4;

import java.util.Scanner;

import Buoi2.Diem;

public class DiemMau  extends Diem{
	private String mau;
	
	//ham xay dung khong doi so
	public DiemMau() {
		super();
		mau = new String();
	}
	//ham xay dung co doi so
	public DiemMau(int x, int y, String m) {
		super(x, y);
		this.mau = new String(m);
	}
	//ham xay dung sao chep
	public DiemMau(DiemMau m) {
		super(m);
		mau = new String(m.mau);
	}
	// gan mau cho diem
	public void GanMau(String m) {
		this.mau = new String(m);
	}
	// ham nhap diem mau
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapDiem(); //Diem.nhapDiem
		mau = sc.nextLine();
	}
	// ham hien thi
	public void in() {
		super.hienThi();
		System.out.print(", mau: " + mau + "");
	}
	// ham hien thi toString
	public String toString() {
		return super.toString() + ", mau: " + mau;
	}
	// ham hien thi co doi so
	public void in(String m) {
		System.out.print(m);
		in();
	}
}
