package practice;

class Circle{
	
	public int radius;
	
	Circle(int r){
		System.out.println("I am circle parameterized constructor");
		this.radius = r;
	}
	
	
	public double area(){
		return Math.PI*this.radius*this.radius;
	}
}

class Cylinder1 extends Circle{
	public int height;
	Cylinder1(int r, int h){
		super(r);
		System.out.println("I am a cylinder parameterized constructor");
		this.height = h;
		
	}
	
	public double volume() {
		return Math.PI*this.radius*this.radius*this.height;
	}
	
}

public class ak_52_ch10practice_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Circle objC = new Circle(12);
		Cylinder1 obj = new Cylinder1(12,4);
		//System.out.println(obj.volume());
		//System.out.println(obj.area());
	}

}
