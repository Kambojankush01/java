package codeExercise2;

class ReverseNumber {

	public static void main(String[]args) {
		
		int num = 12345;
		
		//Logic 1 - Using ALgorithm
		
		int rev=0;
		
		while(num!=0) {
			rev = rev*10 + num%10; //50+4=54  540+3=
			num=num/10;
		}
			
		
		
		//Logic 2 - Using StringBuffer class
//		StringBuffer rev;
//		StringBuffer sb= new StringBuffer(String.valueOf(num));
//		rev= sb.reverse();
		
		//Logic 3 - Using StringBuilder class 
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(num);
//		StringBuilder rev= sbl.reverse();
		
		System.out.println("Reverse num is: "+rev);
		
		
	}
}
