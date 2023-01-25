package codeExercise2;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 12321;
		
		//Reverse the number
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		String str = sb.reverse().toString();
//		int rev = Integer.parseInt(str);
		
		StringBuilder sbl = new StringBuilder();
		String revStr = sbl.append(num).reverse().toString();
		int rev = Integer.parseInt(revStr);
		
		System.out.println("Reverse number is: "+ rev);
		
		if(num==rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("The Number is not palindrome");
		}
		
	}

}
