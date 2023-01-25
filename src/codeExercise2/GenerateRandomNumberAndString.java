package codeExercise2;

import java.util.Random;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {

		
		Random rand = new Random();
		
		System.out.println(rand.nextInt(10));
		
		System.out.println(Math.random());
		
		String str = "            anana    anana     ";
//		str.trim();
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s", ""));
	}

}
