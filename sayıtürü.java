package hafta6odev; //Girilen tam sayının pozitif,negatif,sıfır,tek,çift olduğunu belirleme
import java.util.Scanner;
public class sayıtürü {
	public static void main(String[] args) {
	Scanner girisScanner= new Scanner(System.in);
	System.out.print("Bir tam sayı giriniz: ");
	int sayi=girisScanner.nextInt();
	
	if(sayi%2==0) {                                    //sayının tek ya da çift olduğunu belirtir
		System.out.println(sayi+" çifttir.");
	}else {//(sayi%2 !=0) 
		System.out.println( sayi+" tektir");
	}
	if (sayi>0) {                                       //sayının pozitif,negatif ya da sıfır olduğunu belirtir.
		System.out.println( sayi+" pozitiftir.");
	}else if (sayi<0) {
		System.out.println( sayi+" negatiftir.");
	}else {
		System.out.println( sayi +" girilen sayı sıfırdır.(n ");
	}
	
	}
	}
//26010310079_TuğbaTeker

	
	
	
	
	
	

