package Buoi3;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		SinhVien a = new SinhVien();
//		a.nhapSinhVien();
//		//a.dangkyHp();
//		System.out.println("Thong tin cua sinh vien a:");
//		a.hienThi();
		
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		
		for(int i = 0; i < n; i++)
			ds[i] = new SinhVien();
		for(int i = 0; i < n; i++)
			ds[i].nhapSinhVien();
		for(int i = 0; i < n; i++)
			ds[i].hienThi();
		
		for(int i = 0; i < n; i++) {
			if(ds[i].diemTB() < 2.0)
				ds[i].hienThi();
		}
		
		SinhVien max = ds[0];
		for(int i = 0; i < n; i++) {
			if(ds[i].diemTB() > max.diemTB())
				max = ds[i];		
		}
		System.out.print("\nSinh vien co DTB cao nhat lop la: ");
		max.hienThi();
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(ds[i].layTen().compareTo(ds[j].layTen()) > 0) {
					SinhVien s = ds[i];
					ds[i] = ds[j];
					ds[j] = s;
				}
			}
		}
		
		for(SinhVien s:ds)
			s.hienThi();
	}

}
