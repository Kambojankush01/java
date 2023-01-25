package codeExercise;

import java.util.HashSet;

public class DuplicateElementinArray {

	public static void main(String[] args) {

		
//		String arr[]= {"java","c","c++","python","Java","c"};
		
		//Approach 1: Logical array
//		boolean flag=false;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Found duplicate: "+arr[i]);
//					flag=true;
//					
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("Duplicate not found");
//		}
		
		
		//Approach 2: HashSet collection in java
		
		String arr[]= {"Java","c","c++","python","Java","c"};
		
		HashSet <String>langs=new HashSet();
		boolean flag=false;
		for(String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("Duplicate is found : "+l);
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("Duplicate not found");
		}
		
		
	}

}
