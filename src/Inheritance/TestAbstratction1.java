package Inheritance;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("draw rectangle");
	}
	
}
class Circle extends Shape{
	void draw() {
		System.out.println("draw Circle");
	}
	
}


public class TestAbstratction1 {

	public static void main(String[] args) {
		Shape s=new Circle();
		Shape r=new Rectangle();
		
		s.draw();
		r.draw();
			

	}

}
