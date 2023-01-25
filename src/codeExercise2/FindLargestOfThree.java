package codeExercise2;

public class FindLargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=50,c=30;
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest number is : "+largest);

	}

}
