package Recursion;

public class Recursive_PalindromeCheck {

	public static void main(String[] args) {
		boolean flag = Recursive_PalindromeCheck("madam");
		System.out.println(flag);
		 flag = Recursive_PalindromeCheck("nine");
		System.out.println(flag);
		 flag = Recursive_PalindromeCheck("malayalam");
		System.out.println(flag);
		

	}

	public static boolean  Recursive_PalindromeCheck(String s) {
		if(s.length()==0 || s.length()==1) {
			return true;
		}
		if(s.charAt(0)== s.charAt(s.length()-1)) {
			return  Recursive_PalindromeCheck(s.substring(1,s.length()-1));
		
	}
		return false;

}
}
