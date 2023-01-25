package codeExercise2;

public class CountNumberOfEvenANdOdd {

	public static void main(String[] args) {

		
		int num= 123456;
		
		
		int eventCount = 0,oddCount=0;
		
		while(num>0) {
			int remainder=num%10;
			if(remainder%2==0) {
				eventCount++;
			}
			else {
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("Even count : "+eventCount);
		System.out.println("Odd count : "+oddCount);
		
	}

}
