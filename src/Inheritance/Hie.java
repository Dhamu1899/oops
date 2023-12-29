package Inheritance;
class parent
{
	void show()
	{
		System.out.println("we are parents");
	}
}
class son1 extends parent
{
	void disp()
	{
		System.out.println("i am son class");
	}
}
class daughter extends parent
{
	void disp()
	{
		System.out.println("i am daughter class");
	}
}
public class Hie {

	public static void main(String[] args) {
		son1 s=new son1();
		daughter d=new daughter();
		s.show();
		d.show();
		s.disp();
		d.disp();

	}

}
