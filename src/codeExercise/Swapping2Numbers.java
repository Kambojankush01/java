package codeExercise;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a = 10, b=20;
		System.out.println("Before swapping..."+a+" "+b);
		
//		//Logic 1 - Third variable
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After swapping..."+a+" "+b);
		
		//Logic 2 - Use + & - without using third variable
//		a=a+b; // 10+20=30
//		b=a-b; // 30-20=10
//		a=a-b; // 30-10=20
//		System.out.println("After swapping..."+a+" "+b);
	
		//Logic 3 - use * and / without using third value 
		//			here a & b should not be zero
		
//		a=a*b; // 10*20=200
//		b=a/b; // 200/20=10
//		a=a/b; // 200/10=20
		
		//Logic 4 -bitwise XOR(^)
		
//		a=a^b; //10^20=30
//		b=a^b; //30^20=10
//		a=a^b; //30^20=10
		
		//Logic 5 - Single statement
		//a=10 b=20
//		execution will be right to left<-----
		b=a+b-(a=b); //10+20-(20)--->30-20 and a=b which is 20
		
		
		System.out.println("After swapping..."+a+" "+b);

	}

}
