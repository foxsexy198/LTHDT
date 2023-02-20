package Buoi5;

import java.util.Scanner;

public class MyDate {
		private int d, m, y;
		
		public MyDate() {
			d = 1;
			m = 1;
			y = 1;
		}
		public MyDate (int d1, int m1, int y1) {
			d = d1;
			m = m1;
			y = y1;
		}
		public MyDate(MyDate a) {
			d = a.d;
			m = a.m;
			y = a.y;
		}
		public void in() {
			System.out.println(d + "/" + m + "/" + y);
		}
		public String toString() {
			return d + "/" + m + "/" + y;
		}
		public boolean hopLe() {
			boolean flag = false;
			int Maxday[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if(y%400==0 || y%4==0 && y%100!=0)
				Maxday[2] = 29;
			if(y>0 && m>0 && m<13 && d>0 && d<=Maxday[m])
				flag = true;
			return flag;
		}
		public void nhap() {
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("\nNhap ngay ");
				d = sc.nextInt();
				System.out.print("Nhap thang ");
				m = sc.nextInt();
				System.out.print("Nhap nam ");
				y = sc.nextInt();
			}while(!hopLe());
		}
		public MyDate ngayHomSau() {
			MyDate D = new MyDate(d, m, y);
			D.d++;
			if(!D.hopLe()) {
				D.d = 1;
				D.m++;
				if(!D.hopLe()) {
					D.m = 1;
					D.y++;
				}
			}
			return D;
		}
		public MyDate congNgay(int n) {
			MyDate D = new MyDate(d, m, y);
			for(int i = 0; i < n; i++)
				D = D.ngayHomSau();
			return D;
		}
	

}
