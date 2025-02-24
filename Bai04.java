package Labtuan1;
import java.util.Scanner;
public class Bai04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap nam: ");
		int nam = nhap.nextInt();
		if((nam % 4 ==0 && nam % 100!=0)||(nam % 400==0))
		{
			System.out.print(+nam+" la nam nhuan");
		}
		else
		{
			System.out.print(+nam+" khong phai nam nhuan");
		}
	}
}
