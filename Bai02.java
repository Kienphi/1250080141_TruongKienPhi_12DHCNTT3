package Labtuan1;
import java.util.Scanner;
public class Bai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r,d;
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		d = nhap.nextFloat();
		System.out.print("Nhap chieu rong: ");
		r = nhap.nextFloat();
		float dt;
		dt=d*r;
		System.out.print("Dien tich: "+dt);
	}
}
