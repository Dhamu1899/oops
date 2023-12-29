package Inheritance;
class Bank{
	int account_no=1305;
	String name="dhamu";
	float amount=3000;
	public String getRateofinteres() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class Singleinheritance_Bank extends Bank {
	void deposit(int amount) {
		this.amount+=amount;
	}
	void withdraw(int amount) {
		this.amount-=amount;
	}

	public static void main(String[] args) {
		Singleinheritance_Bank si=new Singleinheritance_Bank();
		si.deposit(1000);
		System.out.println("Account Number: "+si.account_no);
		System.out.println("Name: "+si.name);
		System.out.println("Amount: "+si.amount);		

	}

}
