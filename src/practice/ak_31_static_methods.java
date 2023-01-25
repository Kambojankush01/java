package practice;

abstract class test{
	static int logic(int x, int y) {
		int z; 
		if(x>y) {
			z = x+y;
		}
		else {
			z = (x+y)*5;
			
		}
		return z;
	}
	abstract public void greet();
}
class t2 extends test{
	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Hello!!");
	}
	
}

public class ak_31_static_methods {
	public static void greet() {
		// TODO Auto-generated method stub
		System.out.println("Hello from public class!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		int c;
		c = test.logic(a,b);
		int a1 = 2;
		int b1 = 3;
		int c1;
		c1 = test.logic(a1,b1);
		System.out.println(c);
		System.out.println(c1);
		t2 t2 = new t2();
		t2.greet();
		greet();
		

	}

	

}
