# 1250080141_TruongKienPhi_12DHCNTT3
# 1250080141_TruongKienPhi_12DHCNTT3
--1--
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
--2--
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
--3--
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
--4--
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
--5--
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
--6--
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
}
--7--
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
--8--
package Labtuan1;
import java.util.Scanner;
public class Bai08 {
	public static int sodau(int so){
		while(so>=10){
			so/=10;
		}
		return so;
	}
	public static int socuoi(int so){
		return so%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int so=nhap.nextInt();
		int sodau= sodau(so);
		int socuoi=socuoi(so);
		System.out.println("So dau: "+sodau);
		System.out.println("So cuoi: "+socuoi);
	}
}
--9--
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
--10--
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
--11--
package Labtuan1;
import java.util.Scanner;
public class Bai11 {
	public static int daonguoc(int so){
		int dao=0;
		while(so!=0){
			int a=so%10;
			dao=dao*10+a;
			so/=10;
		}	
		return dao;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int so = nhap.nextInt();
		int dao=daonguoc(so);
		System.out.print("So dao nguoc: "+dao);
	}

}
