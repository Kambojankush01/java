package practice;


class Base1{
	Base1(){
		System.out.println("i am a constructor");
	}
	Base1(int x){
		System.out.println("I am an overloaded constructor with a value of x as :"+x);
	}
}

class Derived1 extends Base1{
	Derived1(){
		//super(3);
		System.out.println("I am a derived class constructor");
	}
	Derived1(int x, int y){
		super(x);
		System.out.println("I am an overloaded constructor of derived with a value of y  as :"+y);
	}
}

class ChildOfDerived extends Derived1{
	ChildOfDerived(){
		System.out.println("I am a child of derived class constructor");
	}
	ChildOfDerived(int x, int y, int z){
		super(x,y);
		System.out.println("I am an overloaded constructor of child of derived with a value of z  as :"+z);
	}
}
public class ak_constructors {

		public static void main(String[] args) {
			//Base1 b1 = new Base1(5);
			//Derived1 d = new Derived1(11,9);
			ChildOfDerived cd = new ChildOfDerived(4,5,6);
			ChildOfDerived cd1 = new ChildOfDerived();

			
			
			

	}

}
