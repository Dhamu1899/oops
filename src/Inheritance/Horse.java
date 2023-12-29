package Inheritance;

public class Horse extends Polymorphism_Animal{
	public void sound() {
	System.out.println("Neigh");
	}

	public static void main(String[] args) {
		Polymorphism_Animal obj=new Horse();
		obj.sound();
		

	}

}
