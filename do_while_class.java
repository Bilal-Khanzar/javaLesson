package do_while;
import java.util.Random;

import java.util.Scanner;

public class do_while_class {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int a  = 10;
		while(a>0) {
			System.out.println(a);
			a--;
		}*/
		
		
		
		/*
		int z =0;
		do {
			System.out.println("sizin degeriniz "+ z);
			z++;
		}while(z<12);*/
		
		Scanner scanner = new Scanner(System.in);
		// do while is same like while loops just one different thing is change that is 
		//even the code give us error but do whiloe try only one time after that exit 
		
		
		
		/*System.out.println("enter one number ");
		int num = scanner.nextInt();
		do {
			System.out.println(num);
			num--;
		}while(num<=0);
		*/
		/*
		System.out.println("bir pozitif deger giriniz ");
		int x= scanner.nextInt();
		do {
			
			System.out.println("x pozitif deger giriniz ");
			x = scanner.nextInt();
			
			
		}while(x<=0);
		System.out.println(x+" degerimiz pozitiftir ");
		*/
		
		
		
		
		/*System.out.println("bir x pozitif deger girinniz ");
		int x = scanner.nextInt();
		while(x<0) {
			
			System.out.println("x pozitiv deger gir2");
			x = scanner.nextInt();
			
		}
		System.out.println("x degerimiz pozitif "+x);*/
		
		
		/*
		int rastgele = (int)(Math.random() * 10 )+1;
		
		int tahmin ;
	
		 do {
			 System.out.println("bir tahmini deger giriniz 1 ile 10 arasinda  ");
			 tahmin = scanner.nextInt();
			 if(tahmin < rastgele) {
				 System.out.println("daha buyuk bir sayi sec ");
			 }else if(tahmin> rastgele) {
				 System.out.println("tahmininiz biraz kucuk secin ");
				 
			 }
			 
		 }while(tahmin != rastgele);
		System.out.println(tahmin + " tahminiz dogrudur "+ rastgele);
		
		*/
		int[] sayilar2 = { 4, 9, 8, 7, 6, 5 };
		for(int i = 2 ; i<7 ; i++) {
			System.out.println(sayilar2[i]);
		}
		
	}

}
