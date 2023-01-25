package practice;

abstract class Parent{
	public Parent() {
		System.out.println("I am a constructor");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	abstract public void greet();
	
}
class Child1 extends Parent{
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
}
abstract class Child3 extends Parent{
	abstract public void th();
}
class Child4 extends Child3{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Namaskar");
	}

	@Override
	public void th() {
		// TODO Auto-generated method stub
		System.out.println("Timepass");
		
	}
	
}



public class ak_53_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 cd = new Child1();
		cd.sayHello();
		cd.greet();
		Child4 cd4 = new Child4();
		cd4.sayHello();
		cd4.greet();
	}

}
