package codeExercise;

public class ReverseEachWordInaString {

	public static void main(String[] args) {

		// Approach 1- Using Logic
//		String str = "Welcome to Java"; //Original String
//		System.out.println("Original String is : "+str);
//		String[] words=str.split(" "); // Splitting string into words
//		
//		String reverseString = "";
//		
//		//To reverse the string
//		
//		for(String w:words) {
//			String reverseWord = "";
//			for(int i=w.length()-1;i>=0;i--) //Welcome 
//			{
//				reverseWord = reverseWord+w.charAt(i); 
//			}
//			reverseString = reverseString+reverseWord+" ";
//		}
//		System.out.println("Reversed String is :"+reverseString);
		
		//Approach 2- Using StringBuilder class
		String str = "Welcome to Java"; //Original String
		System.out.println("Original String is : "+str);
		String []words = str.split("\\s"); // \\s is equal to space
		
		String reverseWord="";
		
		for(String w:words) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			
			reverseWord = reverseWord+sb.toString()+" ";
		}
		System.out.println("Reversed String is : "+reverseWord);
		
		
		
		
	}

}
