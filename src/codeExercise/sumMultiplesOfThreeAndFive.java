package codeExercise;

public class sumMultiplesOfThreeAndFive {
	
	public static int sum(int n) {
		
		int sum =0;
		for(int i=1;i<=n;i++) {
			if (i % 3==0 || i % 5==0) {
				sum+=i;
			}
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		
//		System.out.println(sum(15));//60
//		System.out.println(sum(10));//33
		System.out.println(sum(110));//2843

	}

}
