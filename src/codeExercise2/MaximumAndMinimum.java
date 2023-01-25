package codeExercise2;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,30,50,100,50};
		int max= a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum value is : "+ max);
		
		for(int i =0;i<a.length;i++) {
			if(a[i]<max) {
				max=a[i];
			}
		}
		System.out.println("Minimum value is : "+ max);
		
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				
				System.out.println("Duplicate value in array is : "+ a[j]);
			}
			}
		}
	}

}
