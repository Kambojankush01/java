package codeExercise;

public class ReverseString {

	public static void main(String[] args) {
		
		//1. Using +(String concatination) operator
		String str = "abcde";
		String rev="";
		
//		int len = str.length();//5
//		
//		for(int i =len-1;i>=0;i--) {
//			rev = rev + str.charAt(i);
//		}
		
		//2. Using character array
		
//		char a[]= str.toCharArray();
//		int len = a.length;//5
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+a[i];
//		}
		
		//3. Using StringBuffer class
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println("Reverse string is : "+ sb.reverse());
		
		//4. Using StringBuilder class
		StringBuilder sbl = new StringBuilder();
		sbl.append(str);
		System.out.println("Reverse string is : "+ sbl.reverse());
		

		
//		System.out.println("Reverse string is : "+ rev);

	}

}
