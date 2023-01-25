package codeExercise2;

public class SwappingTheNumbers {

	public static void main(String[] args) {

		
		int a=10,b=20;
		
		System.out.println("Before Swapping :"+a+" "+b);
		//Logic 1
//		
//		int t=a;
//		a=b;
//		b=t;
		
		//Logic 2 - Use +and - using third variable
		
//		a=a+b; // 10+20=30
//		b=a-b; //30-20=10
//		a=a-b; //30-10=20

//		Logic 3- Use* and / operator , none of the value should not be zero
		
//		a=a*b; //10*20=200
//		b=a/b; //200/20=10
//		a=a/b; //200/20=10
		
//		Logic 4 - Bitwise xor(^) operator calculate online
//		a=a^b; //30
//		b=a^b; //10
//		a=a^b; //20
		
//		Logic 5 - Single statement
		//a=10 b=20
		b=a+b-(a=b);//Execution from right to left		
		
		System.out.println("After swapping :"+a+" "+b);
		
		
		
		
	}

}
