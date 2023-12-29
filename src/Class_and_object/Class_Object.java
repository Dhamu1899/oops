package Class_and_object;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Class_Object {
	static int id;
	static String name;
	static String add;
	static String Address;
	static int m1,m2,m3;
	
	static void display(int id,String name,int m1,int m2,int m3,String add,String Address ) {
		float total,avarage;
		total=m1+m2+m3;
		avarage=total/3;
		System.out.println("Student details");
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("mark1:"+m1);
		System.out.println("mark2:"+m2);
		System.out.println("mark3:"+m3);
		System.out.println("total:"+total);
		System.out.printf("avarage:%.2f",avarage);
		System.out.println("\n"+add);
	}

	public static void main(String[] args)throws IOException {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Student Id: ");
		id=s.nextInt();
		System.out.print("Enter the Student name: ");
		name=s.next();
		System.out.println("Enter the address: ");
		DataInputStream object =new DataInputStream(System.in);
		String address=object.readLine();
		
		
		System.out.print("mark1: ");
		m1=s.nextInt();
		System.out.print("mark2: ");
		m2=s.nextInt();
		System.out.print("mark3: ");
		m3=s.nextInt();
		display(id,name,m3,m1,m2,Address,add);
		s.close();
		
		
		

	}

}
