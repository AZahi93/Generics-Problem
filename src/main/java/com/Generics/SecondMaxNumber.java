package com.Generics;

public class SecondMaxNumber {
	public static void SecondPositon(int max, int Maxcalculate) {
		if (max == Maxcalculate) {
			System.out.println("The calculated maximum is " + Maxcalculate + " and calculated maximum is  at second position");
		} else {
			System.out.println("The calculated maximum is " + Maxcalculate + " and calculated maximum is not at second position");

		}
	}

	
	 public static void main( String[] args )
	    {
	        System.out.println( "The Generics Program" );
	        Maximum obj=new Maximum();
	        int max = obj.CalculateMaximum(85,45,69,58,10);
	        SecondPositon(45,max);

	        max = obj.CalculateMaximum(47,12,105);
	        SecondPositon(12,max);
	    }

	}