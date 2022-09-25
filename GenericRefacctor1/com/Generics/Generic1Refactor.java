package com.Generics;

import java.util.Scanner;

public class Generic1Refactor {

	public static void main(String[] args) {
		GenericRefactor1Maximum max = new GenericRefactor1Maximum();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("\n1.Integer\n2.Float\n3.String\nSelect Your Datatype:");
			int ch = scan.nextInt();
			
			switch(ch) {
			case 1:
			{
				System.out.print("Enter First Value: ");
				Integer first = scan.nextInt();
				
				System.out.print("Enter Second Value: ");
				Integer second = scan.nextInt();
				
				System.out.print("Enter Third Value: ");
				Integer third = scan.nextInt();
				
				max.findMax(first,second,third);
				break;
			}	
			case 2:
			{
				System.out.print("Enter First Value: ");
				Float first = scan.nextFloat();
				
				System.out.print("Enter Second Value: ");
				Float second = scan.nextFloat();
				
				System.out.print("Enter Third Value: ");
				Float third = scan.nextFloat();
				
				max.findMax(first,second,third);
				break;
			}
			case 3:
			{
				System.out.print("Enter First Value: ");
				String first = scan.next();
				
				System.out.print("Enter Second Value: ");
				String second = scan.next();
				
				System.out.print("Enter Third Value: ");
				String third = scan.next();
				
				max.findMax(first,second,third);
				break;		
			}
			
			default:
				System.out.println("Enter Choice Between 1 and 3");
			}
		}
		
	}
}
