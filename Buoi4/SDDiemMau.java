package Buoi4;

import java.util.Scanner;

import Buoi2.Diem;

public class SDDiemMau  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiemMau A = new DiemMau(5, 10, "trang");
		A.in();
		DiemMau B = new DiemMau();
		// nhap va in toa do diem B
		B.nhapDiem();
		System.out.print("Toa do diem B la: ");
		B.hienThi();
		// in toa do diem B sau khi tinh tien
		System.out.print("\nToa do diem B sau khi tinh tien va gan mau la: ");
		B.tinhtien(10, 8);
		B.GanMau("vang");
		B.in();
	}

}
