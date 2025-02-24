package Labtuan1;
import java.util.Scanner;
public class Bai07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Diem ly: ");
		float ly = nhap.nextFloat();
		System.out.print("Diem hoa: ");
		float hoa = nhap.nextFloat();
		System.out.print("Diem sinh: ");
		float sinh = nhap.nextFloat();
		System.out.print("Diem toan: ");
		float toan = nhap.nextFloat();
		System.out.print("Diem may tinh: ");
		float mt = nhap.nextFloat();	
		float tb;
		tb=((ly+hoa+sinh+toan+mt)/50)*100;
		System.out.print(+tb);
		if	(tb>90){
			System.out.print(" hang A");
		}
		else if(tb>80){
			System.out.print(" hang B");
		}
		else if(tb>70){
			System.out.print(" hang C");
		}
		else if(tb>60){
			System.out.print(" hang D");
		}
		else if(tb>40){
			System.out.print(" hang E");
		}
		else{
			System.out.print(" hang F");
		}

	}

}
