package Labtuan1;
import java.util.Scanner;
public class Bai12 {
public static boolean ktrdoixung(int so){
	int sobandau=so;
	int sodoixung=0;
	while(so!=0){
		int a=so%10;
		sodoixung=sodoixung * 10 + a;
		so /= 0;
	}
	return sobandau==sodoixung;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int so = nhap.nextInt();
		if(ktrdoixung(so)){
			System.out.print("la so doi xung");
		}
		else
		{
			System.out.print("khong la so doi xung");
		}
	}
}
