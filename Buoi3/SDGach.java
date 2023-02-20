package Buoi3;
import java.util.Scanner;
public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong loai gach: ");
		int n = sc.nextInt();
		Gach A[] = new Gach[n];
		for(int i = 0; i < n; i++)
			A[i] = new Gach();
		for(int i = 0; i < n; i++)
			A[i].nhap();
		for(int i = 0; i < n; i++)
			A[i].hienthi();
		
		Gach chiphimin = new Gach();
		chiphimin = A[0];
		for(int i = 0; i < n; i++) {
			if(A[i].giaBanLe()/A[i].dientichnen() < (chiphimin.giaBanLe()/chiphimin.dientichnen()))
			chiphimin = A[i];
		}
		System.out.print("Loai gach co chi phi phi lot thap nhat la: ");
		chiphimin.hienthi();
		for(int i=0;i<n;i++) {
			
		}
		
		System.out.print("\nChi phi mua gach khi ta lot nen co dien tich 100m vuong la: ");
		
		
	}

}
