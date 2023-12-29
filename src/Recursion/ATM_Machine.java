package Recursion;

import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		while(true){
			int balance=120000,temp=0;
		System.out.println("options:");
		System.out.println("select 1 to withdraw");
		System.out.println("select 2 to deposite");
		System.out.println("select 3 to check balance");
		System.out.println("select 4 to exit");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your option:");
		int n= s.nextInt();
		
		switch(n) {
		case 1:
			System.out.print("enter the amount to withdraw:");
			int w=s.nextInt();
			temp=balance-w;
			System.out.println("The current balance:"+temp);
			break;
		case 2:
			System.out.print("enter the amount to deposite:");
			int d=s.nextInt();
			temp=d+balance;
			System.out.println("The current balance:"+temp);
			break;
		case 3:
			System.out.println("The current balance:"+balance);
			break;
		case 4:
			System.out.print("exit");
			break;
			default:
				System.out.print("enter valid input");
				s.close();
		}

		}
		}
	}