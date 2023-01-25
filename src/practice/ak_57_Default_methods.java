package practice;

interface Camera {
	void takeSnap();

	void recordVideo();

	static void greet() {
		System.out.println("Hello...");
	}

	default void record4kVideo() {
		greet();
		System.out.println("Recording video in 4K...");
	}

}

interface Wifi {
	String[] getNetworks();

	void connectToNetwork(String network);

}

class MyCellPhone {
	void callNumber(int phoneNumber) {
		System.out.println("Calling " + phoneNumber);
	}

	void pickCall() {
		System.out.println("Connecting... ");
	}

}

class MySmartPhone extends MyCellPhone implements Wifi, Camera {

	@Override
	public void recordVideo() {
		// TODO Auto-generated method stub
		System.out.println("Taking Video...");
	}

	@Override
	public String[] getNetworks() {
		// TODO Auto-generated method stub
		System.out.println("Getting list of Networks");
		String[] networkList = { "Harry", "Prashant", "Anjali" };
		return networkList;
	}

	@Override
	public void connectToNetwork(String network) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to " + network);
	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub
		System.out.println("Taking Snap...");
	}

}

public class ak_57_Default_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySmartPhone ms = new MySmartPhone();
		String[] ar = ms.getNetworks();
		for (String item : ar) {
			System.out.println(item);
		}
		ms.record4kVideo();

	}

}
