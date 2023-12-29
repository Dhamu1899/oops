package Inheritance;
interface MyInterface{
	public void method1();
	public void method2();
}
public class Demo_implement_myInterface implements MyInterface {
	
	public void method1() {
		System.out.println("method_1");
	}
	public void method2() {
		System.out.println("method_2");
	}

	public static void main(String[] args) {
		MyInterface obj = new Demo_implement_myInterface();
		obj.method1();
		obj.method2();

	}

}