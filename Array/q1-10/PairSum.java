/*
*	Q1: Given an array A[] and a number x, check for pair in A[] with sum as x
*/

import java.util.Arrays;
import java.lang.Integer;
import java.util.HashSet;

public class PairSum {

	// find pairs by sorting, time complexity depends on sorting algorithm
	// merge sort for O(nlgn), quick sort for O(n) in worst time
	public static void findPair(int[] array, int sum) {
		Arrays.sort(array);
		int i = 0;
		int j = array.length-1;
		while (i < j) {
			if(array[i] + array[j] == sum) {
				System.out.println("found a pair: " + array[i] + ", "+ array[j]);
				i++;
				j--;
			}
			else if(array[i] + array[j] < sum)
				i++;
			else 
				j--;
		}
	}
	
	// find all pairs using HashSet, time complexity O(n)
	public static void quickFind(int[] array, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		int i = 0;
		while(i < array.length) {
			if(set.contains(Integer.valueOf(sum-array[i])))
				System.out.println("A pair is found: "+array[i]+", "+(sum-array[i]));
			else
				set.add(Integer.valueOf(array[i]));
			i++;
		}
	}

	public static void main(String[] args) {
// 		int[] a = {1, 4, 45, 6, 10, -8};
// 		int x = 16;
// 		if(findPair(a, x))
// 			System.out.println("there exists such a pair of which the sum is "+x+" !");
// 		else
// 			System.out.println("there doesn't exist such a pair! ");
			
		int[] b = {1,2,2,3,4,5};
		int y = 6;
		// quickFind(b, y);
		findPair(b, y);
		
	}
}

