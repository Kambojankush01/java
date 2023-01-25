package codeExercise;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {

		
		int a[]= {30,50,400,6,300};
		/*
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		*/
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
	
		System.out.println(min);
	}
	

}
