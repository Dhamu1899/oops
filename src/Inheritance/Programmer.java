package Inheritance;
class Employee{
	int salary=40000;
}

public class Programmer extends Employee {
	int bonus=10000;

	public static void main(String[] args) {
		Programmer p=new Programmer();
		System.out.println("salary:" +p.salary);
		System.out.println("banus:" +p.bonus);
				
	}

}
