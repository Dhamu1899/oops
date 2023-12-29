package Inheritance;
class Encapsulation_1{
private String Name;
private int Age;
private String Contry;


public String getName() {
	return Name;
}
public int getAge() {
	return Age;
}
public String getcontry() {
	return Contry;
}
public void setName(String newValue) {
	Name=newValue;
}
public void setAge(int newValue) {
	Age=newValue;
}
public void setcontry(String newValue) {
	Contry=newValue;
}
}

public class Get_set {

public static void main(String[] args) {
	Encapsulation_1 obj=new Encapsulation_1();
	obj.setName("Mario");
	obj.setAge(32);
	obj.setcontry("india");
	System.out.println("Employee name:"+obj.getName());
	System.out.println("Employee age:"+obj.getAge());
	System.out.println("Employee contry:"+obj.getcontry());

}

}




	