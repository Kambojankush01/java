package codeExercise2;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		int len_a1= a1.length;
		int len_a2= a2.length;
		
		boolean status = true;
		if(len_a1==len_a2) {
			//compare rest of elements
			
			for(int i=0;i<len_a1;i++) {
				if(a1[i]!=a2[i]) {
					status=false;
				}
			}
			
		}else
		{
			status=false;
		}
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
