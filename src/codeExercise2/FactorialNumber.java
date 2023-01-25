package codeExercise2;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		
		long factorial = 1;
		
//		for(int i=1;i<=num;i++) {
//			factorial = factorial*i;
//		}
		int i=1;
		while(i<=num) {
			factorial = factorial*i;
			i++;
		}
		
		System.out.println("Factorial of num is "+factorial);

	}

}
