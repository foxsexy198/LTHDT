package Buoi3;
import java.util.Scanner;
public class Gach {
	private String maso;
	private String mau;
	private int soluong;
	private int dai;
	private int ngang;
	private long gia;
	
	public Gach() {
		maso = new String();
		mau = new String();
		soluong = 0;
		dai = 0;
		ngang = 0;
		gia = 0;
	}
	public Gach(String maso1, String mau1, int soluong1, int dai1, int ngang1, long gia1) {
		maso = new String(maso1);
		mau = new String(mau1);
		soluong = soluong1;
		dai = dai1;
		ngang = ngang1;
		gia = gia1;
	}
	public Gach(Gach a) {
		maso = new String(a.maso);
		mau = new String(a.mau);
		soluong = a.soluong;
		dai = a.dai;
		ngang = a.ngang;
		gia = a.gia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		maso = sc.nextLine();
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
		System.out.print("Nhap soluong: ");
		soluong = sc.nextInt();
		System.out.print("Nhap chieu dai: ");
		dai = sc.nextInt();
		System.out.print("Nhap chieu ngang: ");
		ngang = sc.nextInt();
		System.out.print("Nhap gia ban le cua 1 vien gach: ");
		gia = sc.nextInt();
	}
	public void hienthi() {
		System.out.println("Ma so: " + maso + " -" + " Mau: " + mau + " -" + " So luong: " + soluong + " -" + " Chieu dai: " + dai + " -" + " Chieu ngang: " + ngang + " -" + " Gia ban le: " + gia);
	}
	public String toString() {
		return maso + "-" + mau + "-" + soluong + "-" + dai + "-" + ngang + "-" + gia;
	}
	public float giaBanLe() {
		return (float)gia*(20/100)/soluong;
	}
	public int dientichnen() {
		return (dai*ngang)*soluong;
	}
	public int soLuongHop(int D, int N) {
		return (D*N)/(dai*ngang*soluong);
	}
	public int dientichvien() {
		return dai*ngang;
	}
	public long laygia() {
		Gach a = new Gach();
		return a.gia;
	}
	public int laysoluong() {
		return soluong;
	}
}
