package codeExercise;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		
		System.out.println("Enter Third number:");
		int c = sc.nextInt();
		
		//Approach 1- Logic
//		
//		if(a>b && a>c) {
//			System.out.println(a+" is the Largest Number");
//		}
//		else if(b>a && b>c){
//			System.out.println(b+" is the Largest Number");
//		}else {
//			System.out.println(c+" is the Largest Number");
//		}
		
		//Approach 2- Using Ternary Operator
//		int largest=a>b?a:b;		
//		largest =c>largest?c:largest;
		
		int largest= (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(largest+" is the Largest Number");
	}

}
