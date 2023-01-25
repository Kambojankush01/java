package codeExercise2;

public class PallindromeString {

	public static void main(String[] args) {

		
		String str="kayak";
		System.out.println("Original string is : "+str);
//		StringBuffer sb = new StringBuffer(str);
//		String rev = sb.reverse().toString();
		
		StringBuilder sbl = new StringBuilder();
		String rev = sbl.append(str).reverse().toString();
		System.out.println("Reversed string is : "+rev );
		
		//To check if it is Pallindrome or not 
		if(str.equals(rev)) {
			System.out.println("The string is pallindrome");
		}else {
			System.out.println("The String is not pallindrome");
		}
	}

}
