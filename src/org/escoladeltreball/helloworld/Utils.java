/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author jmenesesl
 *
 */
public interface Utils {
	
	/*
	 * this method returns an integer array with n in its place
	 * NOTE: values is an ordered array
	 */
	public abstract int[] merge(int[] values, int n);
	/*
	 * this method returns true if n is present in values
	 */
	public abstract boolean isPresent(int[] values, int n);

	/*
	 * This method returns the frequency in % of n in values
	 */	
	public abstract double frequencyPercentage(int[] values, int n);
	
	
	/*
	 * This method returns the frequency of n in values
	 */
	public abstract int frequency(int[] values, int n);
	
	/*
	 * This method returns the smallest value in an integer array
	 */
	public abstract int findSmallest(int[] values);
	
	/*
	 * This method returns the sum of values
	 */
	public abstract int sum(int[] values);

}
