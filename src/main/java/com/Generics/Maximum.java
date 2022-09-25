package com.Generics;

public class Maximum {
	public int CalculateMaxNumber(int... numbers) {
		Integer max = Integer.valueOf(numbers[0]);
		for (int num : numbers) {
			Integer temp = Integer.valueOf(num);
			if (temp.compareTo(max) > 0) {
				max = num;
			}
		}
		return max;

	}

	public <E extends Comparable<E>> E CalculateMaximum(E... elements) {
		E max = elements[0];//
		for (E element : elements) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
}
		
