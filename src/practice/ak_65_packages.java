package practice;

import java.util.Scanner;
//import java.util.*; it works


public class ak_65_packages {

	public static void main(String[] args) {
		System.out.println("Please enter a number!!");
		//java.util.Scanner sc = new java.util.Scanner(System.in); it works
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("This is my scanner taking input as "+a);
	}

}
