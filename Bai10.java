package Labtuan1;
import java.util.Scanner;
public class Bai10 {
	public static int dem(int so){
		int dem=0;
		while(so>0){
			so/=10;
			dem++;
		}
		return dem;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap day so: ");
		int so=nhap.nextInt();
		int dem=dem(so);
		System.out.print("So chu so: "+dem);
	}

}