package codeExercise;

public class factorial {
	
	public static void main(String[] args) {

		int num=10;
		long factorial=1;
		
		// 1. Lower to higher 5!=1*2*3*4*5*6=720
		
//		for(int i=1;i<=num;i++) {
//			factorial = factorial*i;
//		}
		
		//2. Higher to Lower 5!=5*4*3*2*1=120
		
		for(int i =num;i>=1;i--) {
			factorial = factorial*i;
		}
		
		System.out.println("Factorial is : "+factorial);
		
	
	}

}
