package Buoi3;
import Buoi2.Diem;
public class SDDoanThang {

	public static void main(String[] args) {
		
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);
		System.out.print("Toa do diem A la: ");
		A.hienThi();
		System.out.print("\nToa do diem B la: ");
		B.hienThi();
		
		DoanThang AB = new DoanThang(A, B);
		System.out.print("\nToa do doan thang AB la: ");
		AB.hienthi();
		System.out.print("\nDoan thang AB sau khi tinh tien: ");
		AB.tinhtien(5, 3);
		AB.hienthi();
		
		DoanThang CD = new DoanThang();
		System.out.println("\nNhap CD: ");
		CD.nhap();
		System.out.print("Toa do doan thang CD la: ");
		CD.hienthi();
		System.out.print("\nDo dai cua CD: " + CD.dodai());
		
		
		System.out.print("\nGoc giua CD voi truc hoanh la: " + CD.tinhGoc());
		

	}

}
