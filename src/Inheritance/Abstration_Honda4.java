package Inheritance;
abstract class Bike{
	abstract void run();
	void display() {
		System.out.println("Non-abstract-method");
	}
	
}

public class Abstration_Honda4 extends Bike {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		Bike obj=new Abstration_Honda4();
		obj.display();
		obj.run();
		
	}

}
