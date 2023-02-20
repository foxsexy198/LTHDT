package Buoi4;

import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		SinhVienCNTT a = new SinhVienCNTT();
//		a.nhap();
//		System.out.println(a);
		int n;
		n = sc.nextInt();
		SinhVienCNTT ds[];
		ds = new SinhVienCNTT[n];
		// nhap danh sach sinh vien
		for(int i = 0; i < n; i++) {
			ds[i] = new SinhVienCNTT();
			ds[i].nhap();
		}
		// in danh sach sinh vien
		sc.nextLine();
		String newemail = sc.nextLine();
//		System.out.println(newemail);
		for(SinhVienCNTT s:ds) {
			if(s.getEmail().equals(newemail))
				s.toString();
		}
	}
}
