package hafta6odev;               //0-100 arası notu harf notu ile çevirme.
import java.util.Scanner;
public class sayınotunuharfnotunaçevirme {
	public static void main (String[]args) {
		Scanner girisScanner = new Scanner(System.in);
		System.out.println("Not giriniz: ");
		int not = girisScanner.nextInt();
		String harf= "";
		
		if(not>100 || not<0) {              //0'dan küçük ve 100'den büyük notları almaz
			System.out.println("Geçersiz not.");
		}else {
		if (not>=90) {
			harf="AA";
		}else if(not>=80) {
			harf="BA";
		}else if(not>=70) {
			harf="BB";
		}else if(not>=60) {
			harf="CC";
		}else {
			harf="FF";
		}
		System.out.println("Notunuz: "+not+" Harf notu: "+harf);
		}	
		}	
		}
		
		
		
	
		
	    	
	 
		
		
	
		
			
		 
		
		



