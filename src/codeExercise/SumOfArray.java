package codeExercise;

public class SumOfArray {

	public static void main(String[] args) {

		
		int a[]= {5,2,7,9,6,11};
		
		int sum=0;
		int len=a.length;
		int count=0;

//		for(int i=0;i<=len-1;i++) {
//			sum=sum+ a[i];
//		}
		
		// Using Enhanced for loop
		for(int value:a) {
			sum=sum+value;
			count++;
		}
		
		
		
		System.out.println("\tSum of elements in Array is : "+sum+"\n\tThe length of the array is : "+count);
		
	}

}
