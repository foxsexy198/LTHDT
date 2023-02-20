package Buoi5;

import java.util.Scanner;

public class SDHoaDon {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong hoa don: ");
		int n = sc.nextInt();
		HoaDon ds[] = new HoaDon[n];
		for(int i = 0; i < n; i++) {
			ds[i] = new HoaDon();
			ds[i].nhap();
		}
		
		for(int i = 0; i < n; i++)
			ds[i].in();
	}
}
