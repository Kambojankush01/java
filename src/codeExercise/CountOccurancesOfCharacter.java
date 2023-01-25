package codeExercise;

public class CountOccurancesOfCharacter {

	public static void main(String[] args) {

		String s="Java Programming Java oops";
		
		int total_count=s.length();//total length of string
		int total_count_after_remove=s.replace("a","").length();// total length after removing a
		
		int Count = total_count-total_count_after_remove;
		System.out.println("Number of Occurances of a: "+Count);
		
	}

}
