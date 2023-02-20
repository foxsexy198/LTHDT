package Buoi3;
import Buoi2.Diem;
import java.util.Scanner;
public class DoanThang {
	private Diem d1;
	private Diem d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem d11, Diem d22) {
		d1 = new Diem(d11);
		d2 = new Diem(d22);
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public DoanThang(DoanThang d) {
		d1 = new Diem(d.d1);
		d2 = new Diem(d.d2);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap diem d1: ");
		d1.nhapDiem();
		System.out.print("Nhap diem d2: ");
		d2.nhapDiem();
	}
	public void hienthi() {
		d1.hienThi();
		d2.hienThi();
	}
	public void tinhtien(int dx, int dy) {
		d1.tinhtien(dx, dy);
		d2.tinhtien(dx, dy);
	}
	public float dodai() {
		return d1.khoangCach(d2);
	}
	public float tinhGoc() {
		float canhHuyen = (float)Math.abs(d2.giaTriY() - d1.giaTriX());
		float canhGocVuong = (float)dodai();
		float kq = (float) Math.asin(canhHuyen/canhGocVuong);
		return kq*(180/(float)Math.PI);
	} 
}
