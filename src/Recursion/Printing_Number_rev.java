package Recursion;

import java.util.Scanner;

public class Printing_Number_rev {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		long n=s.nextLong();
		callMyself(n);
		
		

	}

	private static void callMyself(long i) {
		if(i<=0) {
			return;
		}
		System.out.println(i+" ");
		i=i-1;
		callMyself(i);
		
	}
	

}
