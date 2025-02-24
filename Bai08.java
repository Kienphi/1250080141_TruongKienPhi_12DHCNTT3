package Labtuan1;
import java.util.Scanner;
public class Bai08 {
	public static int sodau(int so){
		while(so>=10){
			so/=10;
		}
		return so;
	}
	public static int socuoi(int so){
		return so%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int so=nhap.nextInt();
		int sodau= sodau(so);
		int socuoi=socuoi(so);
		System.out.println("So dau: "+sodau);
		System.out.println("So cuoi: "+socuoi);
	}
}
