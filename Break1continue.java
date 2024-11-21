package break_Continue;

import java.util.Scanner;

public class Break1continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Break(eteketli ve etiketsiz ) olarak kullanilr 
		// etiketsiz 
		
		
		/*1
		 * for(int i = 0; i< 10; i++) {
			if(i==4) {
				System.out.println("i == 4");
				break;
				
			}
		}*/

		
		//etiketli 
		/* 2
		 * for(int i = 0; i< 10 ; i++) {
			for(int j = 0; j<10; j++) {
				if(i*j > 6) {
		System.out.println(i*j);
					break;
					
				}
				
			}
			
		}*/
		
		
		
		/* 3
		 * 
		int i = 0 ; 
		while(i<10) {
			if(i == 9) {
				
				break;
			}
			System.out.println("i =  "+ i);
			i++;
		}
		*/
		
		
		/*
		 * 4
		int i = 0;
		 
		do {
		if(i == 5) {
			break;
		}
		System.out.println(i);
		i++;
		}while(i<10);
		*/
		
		
		
		// project show us whis day iss today for beginner 
		
		
		        Scanner scanner = new Scanner(System.in);
		        
		        /*
		        System.out.println("Please enter a number between 1 and 7 for the days:");

		        int day = scanner.nextInt();

		        while (day < 1 || day > 7) { // Eğer 1 ile 7 arasında değilse tekrar sor
		            System.out.println("Invalid number, please enter a number between 1 and 7:");
		            day = scanner.nextInt();
		        }

		        switch(day) {
		            case 1:
		                System.out.println("Saturday");
		                break;
		            case 2:
		                System.out.println("Sunday");
		                break;
		            case 3:
		                System.out.println("Monday");
		                break;
		            case 4:
		                System.out.println("Tuesday");
		                break;
		            case 5:
		                System.out.println("Wednesday");
		                break;
		            case 6:
		                System.out.println("Thursday");
		                break;
		            case 7:
		                System.out.println("Friday");
		                break;
		        }
		        */
		        
		        
		      /*
		                for (int i = 1; i <= 5; i++) {
		                    if (i == 3) {
		                        continue; // Skips the iteration when i is 3
		                    }
		                    System.out.println("i = " + i);
		                }*/
		            
		        
		        // Output: i = 1, i = 2, i = 4, i = 5
		        /*
		        int i = 0 ;
		        while(i <= 5) {
		        	i++;
		        	if(i==4) {
		        		
		        		continue;// kendisini saymayip pass geciyou
		        	}System.out.println(i);
		        }

		        */
		     /*   System.out.println("enter  a number");
		        int a = scanner.nextInt();
		        while (a<20) {
					System.out.println("tekrar dene");
					a = scanner.nextInt();
					System.out.println("degerimiz " + a);
					
				}*/
		        
		        
		               /* int i = 0;
		                do {
		                    
		                    if (i == 4) {
		                        continue; // Skips the iteration when i is 4
		                    }
		                    i++;
		                    System.out.println("i = " + i);
		                } while (i < 5);
		            */
		        
		        // Output: i = 1, i = 2, i = 3, i = 5
		        /*

		                 int a = 0;
		                        
		                        while (a < 5) {
		                            if (a == 2) {
		                                a++; // i değerini artırıyoruz, yoksa sonsuz döngü olur
		                                 // i 4 olduğunda bu adımı atla
		                               
		                              continue;
		                            }
		                            System.out.println("i = " + a);
		                            
		                            a++;
		                        }*/
		                    
		                
		                // Output: i = 0, i = 1, i = 2, i = 3, i = 5
		                        
		                        
		                               /*
		                                *  for (int i = 1; i <= 10; i++) {
		                                    if (i % 2 == 0) {
		                                        continue; // Skips the even numbers
		                                    }
		                                    System.out.println("Odd number: " + i);
		                                }
		                            
		                        // Output: Odd number: 1, Odd number: 3, Odd number: 5, Odd number: 7, Odd number: 9
		                                
		                                */



		        
		        
		      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
