package codeExercise;

public class linearSearch {
	
	public static int search(int n,int[] list) {
		
		int index=-1;
		for(int i=0;i<list.length;i++) {
			if(list[i]==n) {
				index=i;
				break;
			}
		}
		
		return index;
	}

	public static void main(String[] args) {
		
//		int[] a1= {3,1,3,2,6,9,7,6};
		int[] a1= {22,22,22,22};
		System.out.println(search(22,a1));

		
		
	}

}
