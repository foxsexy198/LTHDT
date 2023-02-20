package Buoi5;

import java.util.Scanner;

public class KhachHangVip extends KhachHang{
	private MyDate ngaytrothanhVip;
	private float tileGiam;
	
	
	public KhachHangVip() {
		super();
		ngaytrothanhVip = new MyDate();
		tileGiam = 0.0f;
		
	}
	
	public KhachHangVip(KhachHangVip n) {
		super(n);
		ngaytrothanhVip = new MyDate(n.ngaytrothanhVip);
		tileGiam = n.tileGiam;
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
//		int c;
//		System.out.print("Nhap khach hang thuong chon (1), khach hang VIP chon (2): ");
//		c = sc.nextInt();
//		if(c==1)
//			super.nhap();
//		else {
			super.nhap();
			System.out.print("Nhap ngay tro thanh VIP: ");
			ngaytrothanhVip.nhap();
			System.out.print("Nhap ti le giam: ");
			tileGiam = sc.nextFloat();
//		}
		
	}
	public void in() {
		super.in();
		System.out.print("\nNgay tro thanh khach VIP: " + ngaytrothanhVip + "\nTi le giam: " + tileGiam);
	}
}
