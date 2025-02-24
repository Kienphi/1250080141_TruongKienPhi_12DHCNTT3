package Labtuan1;
import java.util.Scanner;
public class Bai05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a=nhap.nextInt();
		System.out.print("Nhap b: ");
		int b=nhap.nextInt();
		System.out.print("Nhap c: ");
		int c=nhap.nextInt();
		int min=a;
		if(b<min){
			min=b;
		}
		if(c<min){
			min=c;
		}
		System.out.print("Min: "+min);
	}

}
