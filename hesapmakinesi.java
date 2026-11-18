package hafta6odev; //+,-,*,/,^,% işlemlerini yapan hesap makinesi (switch ile)

import java.util.Scanner;

public class hesapmakinesi {
	public static void main(String[]args) {
	Scanner giris= new Scanner(System.in);
	System.out.print("İşlem giriniz(ÖR: 2 / 10, boşluk bırakarak giriniz.): "); 
	double x1 = giris.nextDouble();
	char islem = giris.next().charAt(0);
	double x2 = giris.nextDouble();

	switch (islem){
	case '+' : 
		System.out.printf(" =%.2f%n",x1+x2); 
		break;
	case '-' :
		System.out.printf(" =%.2f%n",x1-x2);
		break;
	case '*' :
		System.out.printf(" =%.2f%n",x1*x2);
		break;
	case '/' :
		if(x2==0) {
			System.out.println("Sıfıra bölünemez!");
		}else {
		System.out.printf(" =%.2f%n",x1/x2);
		}
	    break;
	case '^' :
		System.out.printf(" =%.2f%n", Math.pow(x1, x2));
		break;
	case '%' :
		System.out.printf(" =%.2f%n",x1%x2);
		break;	
		default:
		 System.out.println("Geçersiz işlem.");		
		}
	 }
	}
//26010310079_TuğbaTeker
	



