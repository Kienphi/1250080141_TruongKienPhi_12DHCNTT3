package Labtuan1;
import java.util.Scanner;
public class Bai09 {
	public static int tong(int so){
		int tong=0;
		while(so!=0){
			tong+= so%10;
			so/=10;
		}
		return tong;
	}
	public static int tich(int so){
		int kq=1;
		while(so!=0){
			int tich=so%10;
			if(tich!=0){
				kq*=tich;
			}
			so/=10;
		}
		return kq;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int so = nhap.nextInt();
		int tong=tong(so);
		int tich=tich(so);
		System.out.println("Tong cac chu so: "+tong);
		System.out.print("Tich cac chu so: "+tich);


	}

}
