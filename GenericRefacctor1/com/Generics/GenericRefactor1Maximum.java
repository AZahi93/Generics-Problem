package com.Generics;

public class GenericRefactor1Maximum {
	
	public void maxInt(Integer first, Integer second, Integer third) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println("First Element is Largest");
		} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Second Element is Largest");
		} else {
			System.out.println("Third Element is Largest");
		}
	}

	public void maxFloat(Float first, Float second, Float third) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println("First Element is Largest");
		} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Second Element is Largest");
		} else {
			System.out.println("Third Element is Largest");
		}
	}

	public void maxString(String first, String second, String third) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println("First Element is Largest");
		} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Second Element is Largest");
		} else {
			System.out.println("Third Element is Largest");
		}
	}

	public <T extends Comparable<T>> void findMax(T first, T second, T third) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println("First Element is Largest");
		} else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Second Element is Largest");
		} else {
			System.out.println("Third Element is Largest");
		}
	}
}
	
		