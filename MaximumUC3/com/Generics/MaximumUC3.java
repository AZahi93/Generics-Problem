package com.Generics;

import java.util.Scanner;

public class MaximumUC3 {
	public static void main(String[] args) {
		Maximum2UC3 max = new Maximum2UC3();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Value: ");
		String first = scan.next();
		
		System.out.print("Enter Second Value: ");
		String second = scan.next();
		
		System.out.print("Enter Third Value: ");
		String third = scan.next();
		
		max.maxString(first,second,third);
				
	}
}

	