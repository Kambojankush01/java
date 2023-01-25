package practice;

abstract class pen{
	abstract void write();
	abstract void refill();
	
}
//Q1
class FountainPen extends pen{

	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("Write");
	}

	@Override
	void refill() {
		// TODO Auto-generated method stub
		System.out.println("Refill");
	}
	void changeNib() {
		System.out.println("Changing the nib");
	}
	
}
//Q2
class Monkey{
	void jump() {
		System.out.println("Jumping....");
	}
	void bite() {
		System.out.println("Biting....");
	}
}

class Human extends Monkey implements BasicAnimal{
	
	void speak() {
		System.out.println("Hello sir.....");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating....");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleeping....");
	}
}
interface BasicAnimal{
	void eat();
	void sleep();
}


//Q3



public class ak_60_ch11practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1
//		FountainPen f = new FountainPen();
//		f.changeNib();
//		f.refill();
//		f.write();
		
		//Q2
		Human ak = new Human();
		ak.bite();
		ak.eat();
		ak.sleep();
		ak.speak();
		ak.jump();
		
		//Q5
		Monkey saumil = new Human();
		saumil.bite();
		saumil.jump();
		BasicAnimal chandan = new Human();
		chandan.eat();
		chandan.sleep();
		
		
		
		
		
		
	}
	

}
