package codeExercise2;

public class ReverseString {

	public static void main(String[] args) {

		
		String str = "Selenium";
		String rev = "";
		
		// Using concatenation operator
		for(int i=str.length()-1; i>=0;i--)
		{
			rev = rev+ str.charAt(i);
		}
			
			
		// Using StringBuffer class
		
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(sb.reverse());
		
		//Using StringBuilder
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(str);
//		StringBuilder rev1 = sbl.reverse();
//		System.out.println(rev1);
		
		System.out.println(rev);
		
	}

}
