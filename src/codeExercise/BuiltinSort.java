package codeExercise;

import java.util.Arrays;
import java.util.Collections;

public class BuiltinSort {

	public static void main(String[] args) {

		//Approach 1: Using Parallel sort
		
//		int a[]= {30,40,20,65};
//		System.out.println("Array before sorting: "+Arrays.toString(a));
//		
//		Arrays.parallelSort(a);
//		System.out.println("Array after sorting: "+Arrays.toString(a));
		
		//Approach 2: Using sort method
//		System.out.println("Array before sorting: "+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array after sorting: "+Arrays.toString(a));
		
		//Approach 3: Sorting in reverse order i.e descending order
		
		Integer a[]= {30,40,20,65}; // primitive datatype not supported i.e why derived type Integer datatype is used
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting: "+Arrays.toString(a));
		
		
	}

}
