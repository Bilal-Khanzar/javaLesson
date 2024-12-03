package Dizi;

import java.lang.classfile.ClassFile.LineNumbersOption;
import java.security.AllPermission;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class DIZI_9 {

	public static void main(String[] args) {
		// Arry olusturulmasil 
		// veritipi dizi[] = new veritipi[eleman sayisi ];
		// veritipi[] dizi = new veritipi[eleman sayisi ];
		// veritipi[] dizi ={1,2,3,4,5};
		
		
		/*
		 * int dizi[] = new int[5];
		 *
		dizi[0]= 11;
		dizi[1]= 4;
		dizi[2]= 5;
		dizi[3]= 7;
		dizi[4]= 9;
		
		//System.out.println(dizi[3]);
		System.out.println(dizi.length);
		int[] dizi1 = {1,3,2,4,5};
		//System.out.println(dizi1[1]);
		
		for(int i=0; i<dizi.length ;i++) {
			System.out.println(dizi[i]);
		}
		*/
		Scanner scanner = new Scanner(System.in);
		
		/*int dizi[] = new int[5];
		System.out.println("enter number only int num");
		 for(int i=0 ; i< dizi.length ; i++) {
			 dizi[i] = scanner.nextInt();
			 System.out.println(i +" your AllPermission LineNumbersOption areLineNumbersOption here " + dizi[i]);
		 } */
		
		/*
		int dizi[] = new int[5];
		System.out.println("enter number only int num");
		 for(int i=0 ; i< dizi.length ; i++) {
			 dizi[i] = scanner.nextInt();
			 //system.out.println(i +" your AllPermission LineNumbersOption areLineNumbersOption here " + dizi[i]);
			
			 dizi[2]=7;
			 System.out.println(dizi[i]);
		 }
		 
		 */
		 
//		method  sort sirali duzeltme method 
		/*
		int liste[] = {1,5,3,6,4,9,7};
		for(int i = 0; i<liste.length; i++) {
			
			Arrays.sort(liste);
			System.out.println(liste[i]);
			
		}*/
		
		// iki dizi karsilastirip esit mi degeil mi diye bakariz 
		/*
		int d[] = {1,3,4,2};
		int b[] = {1,3,4,2};
		boolean a =  Arrays.equals(d, b);
		System.out.println(a);*/
		
		/*int orejnal[] = {1,2,3,4,8,5,7,9};
		int copy[] = Arrays.copyOf(orejnal, orejnal.length);
		
		for (int i : copy) {
			System.out.println("i degerimiz " + i);
		}
		*/
		
		// konu tekrari diziler tek boyutlu 
		/*
		int dizi[] = new int[5]; // dizi icine 5 elemen yerletirmen gerekir 
		
		dizi[0]=11;
		dizi[1]=13;
		dizi[2]=4;
		dizi[3]=17;
		dizi[4]=21;
		System.out.println(dizi[3]);
		System.out.println("");
		for(int i =0; i< dizi.length ; i++) {
			System.out.println(dizi[i]);
		}*/
		int dizi12[] = {1,2,3,5,4,2,6,6,5,4,10,60};
		
		//int dizix[] = {1,2,3,5,4,2,66,5,4};
		for (int i : dizi12) {
			System.out.println(i);
		}
		
		System.out.println("");
		
		
		for(int j =0; j< dizi12.length ; j++) {
			System.out.println(dizi12[j]);
			
		}
		
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
