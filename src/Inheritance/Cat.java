package Inheritance;

public class Cat extends Polymorphism_Animal{
	public void sound() {
		super.sound(); //super keyword is used to call the method of parent class
	System.out.println("Meow");
	}

	public static void main(String[] args) {
		Polymorphism_Animal obj=new Cat();
		obj.sound();
		

	}

}