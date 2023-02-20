package Buoi4;

import java.util.Scanner;

public class SDDongVat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong dong vat: ");
		int n = sc.nextInt();
		DongVat ds[];
		ds = new DongVat[n];
		for(int i = 0; i < n; i++) {
			ds[i] = new DongVat();
			ds[i].nhap();
		}
		for(DongVat s:ds) {
			s.tiengkeu();
		}
	}

}
