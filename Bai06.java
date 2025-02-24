package Labtuan1;
import java.util.Scanner;
public class Bai06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a=nhap.nextInt();
		System.out.print("Nhap b: ");
		int b=nhap.nextInt();
		System.out.print("Nhap c: ");
		int c=nhap.nextInt();
		if(a+b>c && a+c>b && b+c>a)
		{
			System.out.print("3 canh tam giac hop le");
		}
		else
		{
			System.out.print("3 canh tam giac khong hop le");
		}
	}

}
