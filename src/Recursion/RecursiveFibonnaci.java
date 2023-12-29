package Recursion;

public class RecursiveFibonnaci {

	public static void main(String[] args) {
		for(long i=1; i<=9; i++) {
			System.out.println(fibonacci(i)+" ");
		}
		System.out.println();

	}
	//A recursion fibonacci sequence in java program
	
	public static long fibonacci(long number) {
		if(number == 1 || number == 2) {
			return 1;
		}
		
		return fibonacci(number - 1)+fibonacci(number - 2);
		
	}

}


