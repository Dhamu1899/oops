package Recursion;

public class RecursiveSumofAllNumber {

	public static void main(String[] args) {
		long RecursiveSumofAllNumbe =RecursiveSumofAllNumbe(9);
		System.out.println(RecursiveSumofAllNumbe);

	}

	private static long RecursiveSumofAllNumbe( long number) {
		if(number !=0) { //9+8+7+6+5+4+3+2+1 
			return number+RecursiveSumofAllNumbe( number - 1);
			//9+8+RecursiveSumofAllNumbe(7
			
		}
		else {
			
		return number;
		}
	}

}
