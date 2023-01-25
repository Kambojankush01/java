package codeExercise;

public class EvenOddFromArray {

	public static void main(String[] args) {

		
		int a[]= {1,2,3,4,5,6};
		
		// Extracting even number......................
		System.out.print("Even numbers in array: ");
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.print("\t"+a[i]);
//			}
//		}
//		System.out.print("\nOdd numbers in array: ");
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2!=0) {
//				System.out.print("\t"+a[i]);				
//			}
//		}
		
		//Using Enhanced for loop
		for(int v:a) {
			if(v%2==0) {
				System.out.print("\t"+v);
			}
		}
		System.out.print("\nOdd numbers in array: ");
		for(int v:a) {
			if(v%2!=0) {
				System.out.print("\t"+v);
			}
		}
		
		
	}

}
