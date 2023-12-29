package Inheritance;
class Teacher{
	int rollno;
	String name;
	float fee;
	Teacher(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;

	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class TestThis1 {

	public static void main(String[] args) {
		Teacher s1=new Teacher(111,"anitha",4000f);
		Teacher s2=new Teacher(112,"gokul",8000f);
		s1.display();
		s2.display();
		
		

	}

}
