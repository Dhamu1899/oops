package Class_and_object;

import java.util.Scanner;

public class Constructor {
	int emp_id,salary;
	String emp_name;
	Constructor(){
		//default constructor  - no parameters inside the constructor method
		emp_id=1;
		emp_name="Dhamu";
		salary=20000;
		
	}
	Constructor(int id,String name,int sal){
		emp_id=id;
		emp_name=name;
		salary=sal;
	}
	
	void display() {
		System.out.println("Employeer Details : ");
		System.out.println("Emp_id : "+emp_id);
		System.out.println("Emp_name : "+emp_name);
		System.out.println("salary : "+salary);
	}

	public static void main(String[] args) {
		Constructor obj=new Constructor();
		obj.display();
		Constructor obj1=new Constructor(2,"vinoth",25000);
		obj1.display();
		
		
		Scanner s=new Scanner(System.in);
		int id,salary;
		String name;
		System.out.println("Enter the Employee id :");
		id=s.nextInt();
		System.out.println("Enter the Employee name :");
		name=s.next();
		System.out.println("Enter the Employee salary :");
		salary=s.nextInt();
		Constructor obj2=new Constructor(id,name,salary);
		obj2.display();
		s.close();
		
		
	}

}
