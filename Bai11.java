package Labtuan1;
import java.util.Scanner;
public class Bai11 {
	public static int daonguoc(int so){
		int dao=0;
		while(so!=0){
			int a=so%10;
			dao=dao*10+a;
			so/=10;
		}	
		return dao;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int so = nhap.nextInt();
		int dao=daonguoc(so);
		System.out.print("So dao nguoc: "+dao);
	}

}
