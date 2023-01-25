package practice;

class EkClass{
	
	int a;
	
	public int getA() {
		
		return a;
		
	}
	EkClass(){
		System.out.println("I am a constructor of ekclass without parameter");
	}
	
	EkClass(int a){
		this.a= a;
		 
	}
	public int returnone() {
		return 1;
	}
}
	
class DoClass extends EkClass{
		DoClass(int c){
			super(c);
			System.out.println("I am a constructor");
		}
	}
	


public class ak_47_this_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EkClass e = new EkClass();
		DoClass d = new DoClass(5);
		System.out.println(e.getA());
	}

}
