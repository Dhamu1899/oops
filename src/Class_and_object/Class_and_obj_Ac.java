package Class_and_object;

import java.util.Scanner;

public class Class_and_obj_Ac {
	static int Ac_id;
	static String Ac_name;
	static String Ac_Address;
	static int Ac_contact;
	static float Deposit_Amount;
	
	static void display(int Ac_id,String Ac_name,String Ac_Address,int Ac_Contact,float deposit_Amount) {
		
		
		System.out.println("Ac Holder details");
		System.out.println("Customer id:"+Ac_id);
		System.out.println("Customer name:"+Ac_name);
		System.out.println("Customer Address: "+Ac_Address);
		System.out.println("Customer Contact No:"+Ac_Contact);
		System.out.printf("Customer Deposit Amourt %.2f:",Deposit_Amount);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Customer Id: ");
		Ac_id=s.nextInt();
		System.out.print("Customer name: ");
		Ac_name=s.next();
		System.out.print("Customer Address: ");
		Ac_Address=s.next();
		System.out.print("Customer Contact: ");
		Ac_contact=s.nextInt();
		System.out.print("Customer deposit amount ");
		Deposit_Amount=s.nextInt();
		display(Ac_id,Ac_name,Ac_Address,Ac_contact,Deposit_Amount);
		s.close();
		
		
		

	}

}


