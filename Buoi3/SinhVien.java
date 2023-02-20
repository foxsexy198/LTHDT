package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien {
	private String MSSV;
	private String hoTen;
	private Date ngSinh;
	private int soluongHp;
	private String tenHp[];
	private String diemHp[];
	
	public SinhVien() {
		MSSV = new String();
		hoTen = new String();	
		ngSinh = new Date();
		soluongHp = 0;
		tenHp = new String[100];
		diemHp = new String[100];
	}
	public SinhVien(String MSSV1, String hoTen1, Date ngSinh1, int soluongHp1, String tenHp1[], String diemHp1[]) {
		MSSV = new String(MSSV1);
		hoTen = new String(hoTen1);
		ngSinh = new Date(ngSinh1);
		soluongHp = soluongHp1;
		tenHp = new String[100];
		diemHp = new String[100];
		for(int i = 0; i < soluongHp; i++) {
			tenHp[i] = new String(tenHp1[i]);
			diemHp[i] = new String(diemHp[i]);
		}
	}
	public SinhVien(SinhVien n) {
		MSSV = new String(n.MSSV);
		hoTen = new String(n.hoTen);
		ngSinh = new Date(n.ngSinh);
		soluongHp = n.soluongHp;
		tenHp = new String[100];
		diemHp = new String[100];
		for(int i = 0; i < soluongHp; i++) {
			tenHp[i] = new String(n.tenHp[i]);
			diemHp[i] = new String(n.diemHp[i]);
		}
	}
	Scanner sc= new Scanner(System.in);
	public void nhapSinhVien(){
		System.out.print("Nhap MSSV: ");
		MSSV = sc.nextLine();
		System.out.print("Nhap ho ten sinh vien: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngSinh.nhapDate();
		System.out.print("Nhap so luong hoc phan dang ky: ");
		soluongHp = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < soluongHp; i++) {
			System.out.print("Nhap ten hoc phan dang ky: ");
			tenHp[i] = sc.nextLine();
			System.out.print("Nhap diem hoc phan: ");
			diemHp[i] = sc.nextLine();
		}
	}
	public void hienThi() {
		System.out.print("MSSV: " + MSSV + " - Ho ten: " + hoTen + " - Ngay sinh: " + ngSinh + " - So luong hoc phan: " + soluongHp );
		for(int i = 0; i < soluongHp; i++) {
			System.out.print(" - Ten hoc phan " + (i+1) + ": " + tenHp[i]);
			System.out.print(" - Diem hoc phan " + (i+1) + ": " + diemHp[i]);
		}
	}
	public String toString() {
		String s = "MSSV: " + MSSV + " - Ho ten: " + hoTen + " - Ngay sinh: " + ngSinh + " - So luong hoc phan: " + soluongHp ;
		for(int i = 0; i < soluongHp; i++) {
			System.out.print("- Ten hoc phan " + (i+1) + ": " + tenHp[i]);
			System.out.print("- Diem hoc phan " + (i+1) + ": " + diemHp[i]);
		}
		return s;
	}
	
	public float diemTB() {
		float diem = 0;
		for(int i = 0; i < soluongHp; i++) {
			if(diemHp[i].equals("A"))
				diem += 4.0;
			else if(diemHp[i].equals("B+"))
				diem += 3.5;
			else if(diemHp[i].equals("B"))
				diem += 3.0;
			else if(diemHp[i].equals("C+"))
				diem += 2.5;
			else if(diemHp[i].equals("C"))
				diem += 2.0;
			else if(diemHp[i].equals("D+"))
				diem += 1.5;
			else if(diemHp[i].equals("D"))
				diem += 1.0;
		}
		return diem/soluongHp;
	}
	public void dangkyHp() {
		System.out.print("\nNhap so luong hoc phan muon dang ky: ");
		soluongHp = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i < soluongHp; i++) {
			System.out.print("Nhap ten hoc phan" + (i+1) + ": ");
			tenHp[i] = sc.nextLine();
		}
	}
	public void xoaHp(String hpxoa) {
		int i = 0;
		for(i = 0; i < soluongHp; i++) {
			if(tenHp[i].equals(hpxoa)) {
				break;
			}
		}
		if(i < soluongHp) {
			for(int j = i; j < soluongHp-1; j++) {
				tenHp[j] = tenHp[j+1];
				diemHp[j] = diemHp[j+1];
			}
			soluongHp--;
		}
	}
	
	public String layTen() {
		return hoTen;
	}
}
