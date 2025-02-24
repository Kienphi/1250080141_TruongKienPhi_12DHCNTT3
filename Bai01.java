package Labtuan1;
import java.util.Scanner;
public class Bai01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ten,date,mssv;
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		ten = nhap.nextLine();
		System.out.print("Nhap ngay sinh: ");
		date = nhap.nextLine();
		System.out.print("Nhap mssv: ");
		mssv = nhap.nextLine();
		System.out.print("Thong tin: "+ten+" "+date+" "+mssv);
	}
}
