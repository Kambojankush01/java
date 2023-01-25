package practice;

public class ak_reverse_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ankush";
		String b="";
		
		for (int i = s.length()-1;i>=0;i++) {
			b=b+s.charAt(i);
			System.out.println(b);
		}
		
	}

}
