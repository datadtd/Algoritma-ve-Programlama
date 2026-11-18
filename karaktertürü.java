package hafta6odev;                     //Girilen karakterin büyük,küçük harf / rakam ya da diğer olduğunu bulma

import java.util.Scanner;

public class karaktertürü {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Bir karakter giriniz: ");
		char karakter = giris.next().charAt(0);
		
		if (karakter>='0' && karakter<='9') {
			System.out.println(karakter+ " rakamdır.");
		}else if(karakter>='A' && karakter<='Z') {
			System.out.println(karakter+ " Büyük harftir.");
		}else if (karakter>='a' && karakter<='z'){
			System.out.println(karakter+ " Küçük harftir. ");	
	}else {
		System.out.println(karakter+ " rakam ya da harf değil.");
}
	}
}
//26010310079_TuğbaTeker
		
		
		
	


