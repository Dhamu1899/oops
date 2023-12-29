package Inheritance;

abstract class sum{
	public abstract int sumofTwo(int n1,int n2);
	public abstract int sumofThree(int n1,int n2,int n3);
	public void disp() {
		System.out.print("Method of the class sum");
	}
	
}

class Demo extends sum{
	public int sumofTwo(int num1,int num2) {
		return num1+num2;
	}
	public int sumofThree(int num1,int num2,int num3) {
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		sum obj=new Demo();
		System.out.println(obj.sumofTwo(3,4));
		System.out.println(obj.sumofThree(4,3,19));
		obj.disp	();

	}

}
