package while_for;

import java.util.Scanner;

public class For_while_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for(int i=1; i <= 10 ; i++ ) {
			for(int j=1;j<=10 ; j++) {
				System.out.println(i+"*"+j +" ="+i*j);
				
			}
		}
		*/
		
	// exercise 1
		Scanner scanner = new Scanner(System.in);
		//System.out.println("please enter one number");

		/*int n = scanner.nextInt();
		
		while(n<0 || n>10) {
			System.out.println("please try agin its bigger then then or smaller then ten"+n);
			
			n=scanner.nextInt();
		
			
		}		
		*/
		/*exercise 2
		 * int i=0;
		while(i<50) {
			System.out.println(i);
			i++;
		}*/
		
		/*exercise 3
		 * int i =10;
		while(i>0) {
			System.out.println(i);
			i--;
		}*/
		
		// 1 to hundred sum of even number 
		/*
		 * int n = 0;
		int i =0;
		
		while(i<100) {
			if(i%2==0) {
				n += i;
				System.out.println("sum of even numbers "+n);
			}
			
			i++;
		}
		System.out.println("sum of even numbers "+n);
		*/
		// exercise 4
		//factoryel 
		
		/*System.out.println("enter a number we will help you to change factoryel ");
		int i = scanner.nextInt();
		double fak = 1;
		while(i>0) {
			fak*=i;
			
			i--;
		}
		System.out.println(fak);
		*/
		
		
		
		//exercise 5
		// this ecercise we will write  aa code one to hundred 5 doublr
		/*int i = 100;
		while(i>0) {
			if(i%5==0) {
				System.out.println("double of 5 numbers " + i);
				i++;
			}
		}
		*/
		
		
		/*exercise 6 
		 *  enter the number ,when u enter positive num it will end 
		 * int n;
		System.out.println("biri pozitif sayi girin ");
		n = scanner.nextInt();
		while(n<=0) {
			System.out.println("bir pozitif deger girin ");
			n = scanner.nextInt();
			
		}
		System.out.println("your poztif num is :" + n);
		*/
		
		
		// enter the num my cod will check is that prime numm or not 
	
		/*
		 *  while (true) {
		 */
	         
		
		
		
		
		/* this code is not finish 
		 * 
		 * System.out.println("Bir asal sayı girin (Negatif girildiğinde program sonlanır): ");
	            int n = scanner.nextInt();
	            
	            if (n < 0) {
	                System.out.println("Negatif bir sayı girildi, program sonlandırılıyor.");
	                break;
	            }
	            
	            boolean asal = true;
	            if (n < 2) {
	                asal = false; // 2'den küçük sayılar asal sayı değildir.
	            } else {
	                for (int i = 2; i <= Math.sqrt(n); i++) { // 2'den karekök(n)'e kadar kontrol
	                    if (n % i == 0) {
	                        asal = false;
	                        break;
	                    }
	                }
	            }

	            if (asal) {
	                System.out.println(n + " bir asal sayıdır.");
	            } else {
	                System.out.println(n + " bir asal sayı değildir.");
	            }
	        }*/
		
		// icinde kikarakterlerin kac kere gectigini bulmak 
		
		/*exercise 10
		 * 
		 * String str = "programlama";
		char target = 'a';
		int count = 0, i = 0;
		while (i < str.length()) {
		    if (str.charAt(i) == target) {
		        count++;
		    }
		    i++;
		}
		System.out.println(target + " harfi " + count + " kez geçiyor.");

	        */
		
		
		
		
	   // exercise no :write the result is returen the name 
		/*
		String word = "bilal";
	   String reverse = "";
	   int i = word.length()-1;
	   while(i>=0) {
		   reverse += word.charAt(i);
		   System.out.println(reverse);
		   i--;
	   }*/
		
		/*
	     System.out.println("bir deger gir ");
		int a = scanner.nextInt();
		while(true) {
			if(a%2==0 && a>=0) {
				System.out.println("cift degerimiz "+a);
				break;
			}
			System.out.println("tekrar deneyin");
			a = scanner.nextInt();
		}
		*/

		/*
		 * while Döngüsü Kullanım Amaçları   Bilinmeyen Sayıda Tekrar Gereken Durumlar:

Döngü kaç kere çalışacaksa sayısını
 önceden bilmediğimiz durumlarda kullanılır. Örneğin, kullanıcı bir belirli bir değer girene kadar veri girişi isteyebiliriz.
Kullanıcıdan Geçerli Girdi Almak:

Örneğin, geçerli bir parola girilene kadar kullanıcıdan parola girmesini isteyen bir sistem.
Koşula Bağlı Sürekli Kontrol Gereken Durumlar:

Örneğin, bir dosya indirme işlemi tamamlanana kadar beklemek veya bir bağlantı sağlanana kadar tekrar denemek gibi koşullar.
Sonsuz Döngüler:

Bazı sistemler sonsuz döngüler içinde while (true) yapısını kullanır ve döngüyü sonlandırmak için break 
komutu ile özel bir koşul kontrol edilir. Örneğin, bir sunucu sürekli veri bekleyen bir döngüde olabilir.
		 */
		
		/* for kullanim amaclari 
		 * 
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir deger gir");
		int a = scan.nextInt();
		int sum = 0;
		
		while (true) {
			if(a >0) {
				sum += a;
				
				
			}else if(a <=0 ) {
				System.out.println("toplam deeger " + sum);
				break;
			}
			System.out.println("bir deger gir 1");
			a = scan.nextInt();
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
