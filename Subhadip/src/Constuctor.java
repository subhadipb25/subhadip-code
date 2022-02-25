
class Abc
{
	int num1;
	int num2;
	int result;

	public Abc()
	{
		num1 = 5;
		num2 = 5;
		System.out.println("in contructor");
	}
	
		public Abc(int n)
	{
		num1 = n;
		num2 = n;
	}
		public Abc(double d, int n)
		{
		num1 = (int) d;
		num2 = n;
		}
	}


public class Constuctor 
{

	public static void main(String[] args) 
	{
		
		Abc obj = new Abc(9.5,8);	// Abc() is a constructor
		
		System.out.println(obj.num1);
	
		}

}
