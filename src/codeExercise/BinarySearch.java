package codeExercise;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9,10}; //Should be in sorted order
		/*
		//Approach 1 : Logic
		boolean flag=false;
		int key=100;
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			
			if(a[m]==key) {
				System.out.println("Element Found.....");
				flag=true;
				break;
			}
			
			if(a[m]<key) {
				l=m+1;
			}
			
			if(a[m]>key) {
				h=m-1;
			}
		}
		if(flag==false) {
			System.out.println("ELement not found.....");
		}
		*/
		
		//Approach 2 : Binary search using Arrays.binarySearch()
		
		System.out.println(Arrays.binarySearch(a, 7));
		
		
		
	}

}
