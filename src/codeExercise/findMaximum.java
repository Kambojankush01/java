package codeExercise;

public class findMaximum {

	public static int maximum(int[]list) {
		int max = list[0];
		for(int i:list) {
			if(i>max) {
				max =i;
			}
		}
		
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] success = {0,1};
		System.out.println(maximum(success));
		int[] success1 = {505,10};
		System.out.println(maximum(success1));
		int[] success2 = {20,20,20};
		System.out.println(maximum(success2));
		int[] success3 = {2};
		System.out.println(maximum(success3));
		

	}

}
