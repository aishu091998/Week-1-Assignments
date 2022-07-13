package week1.day1;

public class MyMobile {
	String name;
	String model;
	
	public void makeCall() {
		System.out.println(name);
	}
	public void sendMessage() {
		System.out.println(model);
	}
	public static void main(String[] args) {
		MyMobile obj = new MyMobile(); 
		obj.name = "vivo";
		obj.model="vivov17";
		obj.makeCall();
		obj.sendMessage();
	}
	
}
