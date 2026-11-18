package hafta6odev;      //Üçgen türünü bulma 
import java.util.Scanner;
public class ucgenturleri {
	public static void main(String[]args) {
		Scanner girisScanner= new Scanner(System.in);
		System.out.print("a:");
		int a = girisScanner.nextInt();
		System.out.print("b:");
		int b = girisScanner.nextInt();
		System.out.print("c:");
		int c = girisScanner.nextInt();
		
		if(a+b>c && b+c>a && a+c>b) {    //üçgen olması için gerekir
			if(a==b && b==c) {                   // Eşkenar Üçgen olma durumu
				System.out.println("Eşkenar Üçgen");
			}else if(a==b || a==c || b==c) {     //İkizkenar Üçgen olma durumu
				System.out.println("İkizkenar Üçgen");
			}else {
				System.out.println("Çeşitkenar Üçgen");
			}
		}else {
				System.out.println("Üçgen değildir! (Bu kenarlar üçgen olamaz)");
			}
		}
	}
//26010310079_TuğbaTeker


