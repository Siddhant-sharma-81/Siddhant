package question1;

// importing packages

import java.io.IOException;

import java.util.Scanner;

public class Calculations {
	
	// calculation method with exception handling.
	
	public static void calculation() throws IOException{
		
		// declaring variables and scanner object.
		
		Scanner scanner = new Scanner(System.in);
		
		double salesTax = 0;
		double finalPrice = 0;
		double totalFinalPrice = 0;
		int flag = 1;
		String a;
		 
		String[] name = new String[10];
		double[] price = new double[10];
		int[] quantity = new int[10];
		String[] type = new String[10];
		
		int i = 0;
		
		// declaring loops.
		
		do{
			
			System.out.println(" ");
			System.out.println("Enter the values");
			
			System.out.println("name");
			name[i] = scanner.next();
			
			System.out.println("price");
			price[i] = scanner.nextDouble();
			
			System.out.println("quantity");
			quantity[i] = scanner.nextInt();
			
			System.out.println("type (raw/manufactured)");
			type[i] = scanner.next();

			// calculations
			
				if(type[i].equals("raw") || type[i].equals("Raw")) {
				
				salesTax = price[i] * (15.5/100);
				
				finalPrice = salesTax + price[i];
				
				totalFinalPrice = (salesTax + price[i])*quantity[i];
				
				// Printing final data.
				
				System.out.println(" ");
				System.out.println("Item Name = "+name[i]);
				System.out.println("Item Price = "+price[i]);
				System.out.println("Sales tax liability per item = "+salesTax);
				System.out.println("Final Price per piece = "+finalPrice);
				System.out.println("Total final price = "+totalFinalPrice);
				
				}	
			
				else if(type[i].equals("manufactured") || type[i].equals("Manufactured")) {
				
				salesTax = price[i] * (20.5/100);
				
				finalPrice = salesTax + price[i];
				
				totalFinalPrice = (salesTax + price[i])*quantity[i];
				
				// Printing final data.
				
				System.out.println(" ");
				System.out.println("Item Name = "+name[i]);
				System.out.println("Item Price = "+price[i]);
				System.out.println("Sales tax liability per item = "+salesTax);
				System.out.println("Final Price per piece = "+finalPrice);
				System.out.println("Total final price = "+totalFinalPrice);
				}
			
				else {
				
				System.out.println("invalid entry");
				
				}
			
				System.out.println(" ");
			
				System.out.println("Do you want to continue ? (y/n)");
			
				a = scanner.next();
			
				if(a.equals("y")) {
				
				flag = 1;
			
				}
			
				else{
				
				flag = 0;
				System.out.println("Exiting");
			
				}
			
				i++;
			
		}while(flag==1);
		
	}
	
}
