

class simple
{
	String s= "single inheritance";
	public void test()
	{
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(i);
		}
	}

	public void count()
	{
		System.out.println(s);
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i*2);
		}
	}
}
class Demo extends simple
{
	public void display()
	{

		System.out.println(s);
		for(int i=5 ; i>=1; i--)
		{
			// System.out.println("s");
			System.out.println(i);
		}

	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		d1.test();
		d1.count();
		d1.display();
	}

}
