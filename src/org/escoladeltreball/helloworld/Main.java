/**
 * 
 */
package org.escoladeltreball.helloworld;

import java.util.Arrays;

/**
 * @author jmendez
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] v = { 2, 3, 4, 5, 3, 2, 1 };
		Main main = new Main();
		System.out.println(main.findSmallest(v)); 
		int[] values = {3, 7, 9, 10, 13, 21 };
		int[] result = main.merge(values, 11);
		System.out.println(Arrays.toString(result));
		boolean iguales = values == result? true : false;
		if (main.isPresent(values, 3))
			System.out.println("Está presente");
	}
//	String resultado = main.isPresent(v, 1)? "si" : "no";
//	System.out.println()
	
	

	
	/*
	 * (non-Javadoc) This methods returns the smallest value from values
	 * 
	 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	 */
	@Override
	public int findSmallest(int[] values) {
		int temp = values[0];
		for (int value : values) {
			if (value < temp) {
				temp = value;
			}
		}
		return temp;
	}

	@Override
	public int sum(int[] values) {
		int temp = 0;
		for (int value : values) {
			temp += value;
		}
		return temp;
	}

	@Override
	public int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (n == value) {
				counter++;
			}
		}
		return counter;
	}

	
	public double frequencyPercentage(int[] values, int n) {
		return ((double) frequency(values, n)) / values.length * 100;
	}

	@Override
	public boolean isPresent(int[] values, int n) {
		// TODO Auto-generated method stub
		for (int value : values) {
			if (value == n) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int[] merge(int[] values, int n) {
		// TODO Auto-generated method stub
		int[] result = new int[values.length+1];
		int j = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] <= n && values[i+1] >= n) {
				result[j] = values[i];
				result[j+1] = n;
				j++;
			} else {
				result[j] = values[i];
			}
			j++;
		}
		return result;
	}


}
