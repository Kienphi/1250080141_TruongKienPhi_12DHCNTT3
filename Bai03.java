package Labtuan1;
import java.util.Scanner;
public class Bai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap do F: ");
		double f = nhap.nextDouble();
		double c;
		c=(f-32)/1.8;
		System.out.print("Do C: "+c);
	}

}
