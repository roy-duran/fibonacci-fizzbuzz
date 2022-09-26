package com.cooksys.ftd.assignments.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Fibonacci sequence is simply and recursively defined: the first two
 * elements are `1`, and every other element is equal to the sum of its two
 * preceding elements. For example:
 * <p>
 * [1, 1] => [1, 1, 1 + 1] => [1, 1, 2] => [1, 1, 2, 1 + 2] => [1, 1, 2, 3] =>
 * [1, 1, 2, 3, 2 + 3] => [1, 1, 2, 3, 5] => ...etc
 */
public class Fibonacci {

	/**
	 * Calculates the value in the Fibonacci sequence at a given index. For example,
	 * `atIndex(0)` and `atIndex(1)` should return `1`, because the first two
	 * elements of the sequence are both `1`.
	 *
	 * @param i the index of the element to calculate
	 * @return the calculated element
	 * @throws IllegalArgumentException if the given index is less than zero
	 */
	public static int atIndex(int i) throws IllegalArgumentException {
		if (i < 0) {
			throw new IllegalArgumentException();
		}
		return fibonacci(i + 1)[i];
//		int first = 1, second = 1, result = 2;
//		if (i == 0 || i == 1) {
//			result =  1;
//		}
//		
//		for (int j = 2; j <= i; ++j) {
//			result = first + second;
//			first = second;
//			second = result;
//		}
//		return result;

	}

	/**
	 * Calculates a slice of the fibonacci sequence, starting from a given start
	 * index (inclusive) and ending at a given end index (exclusive).
	 *
	 * @param start the starting index of the slice (inclusive)
	 * @param end   the ending index of the slice(exclusive)
	 * @return the calculated slice as an array of int elements
	 * @throws IllegalArgumentException if either the given start or end is
	 *                                  negative, or if the given end is less than
	 *                                  the given start
	 */
	public static int[] slice(int start, int end) throws IllegalArgumentException {
		if ((start < 0 || end < 0) || end < start) {
			throw new IllegalArgumentException();
		}
		return Arrays.copyOfRange(fibonacci(end), start, end);
//		List<Integer> fibList = new ArrayList<Integer>();
//		for (int i = start; i < end; i++) {
//			fibList.add(atIndex(i));
//		}
//		int[] fibSlice = new int[fibList.size()];
//		for (int i = 0; i < fibList.size(); i++) {
//			fibSlice[i] = fibList.get(i);
//		}
//		return fibSlice;
	}

	/**
	 * Calculates the beginning of the fibonacci sequence, up to a given count.
	 *
	 * @param count the number of elements to calculate
	 * @return the beginning of the fibonacci sequence, up to the given count, as an
	 *         array of int elements
	 * @throws IllegalArgumentException if the given count is negative
	 */
	public static int[] fibonacci(int count) throws IllegalArgumentException {
		if (count < 0) {
			throw new IllegalArgumentException();
		}
		int[] result = new int[count];
		for (int i = 0; i < result.length; i++) {
			if (i == 0 || i == 1) {
				result[i] = 1;
			} else {
				result[i] = result[i - 1] + result[i - 2];
			}
		} return result;
		
//		List<Integer> fibList = new ArrayList<Integer>();
//		for (int i = 0; i < count; i++) {
//			fibList.add(atIndex(i));
//		}
//		int[] fibArray = new int[fibList.size()];
//		for (int i = 0; i < fibList.size(); i++) {
//			fibArray[i] = fibList.get(i);
//		}
//		return fibArray;
	}
}
