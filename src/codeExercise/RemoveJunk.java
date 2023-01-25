package codeExercise;

public class RemoveJunk {

	public static void main(String[] args) {

		String s="#$@#$My name is l$#$%^akha#%#n";
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
		
		
	}

}
