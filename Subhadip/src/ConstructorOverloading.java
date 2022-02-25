
class Cab
{
	int num1;
	int num2;
	String operation;
	
	public Cab()
	{
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
		
	}
	public Cab(int i)
	{
		num1 = i;
		num2 = 0;
		operation = "Nothing";
		
	}
	public Cab(int i, int j)
	{
		num1 = i;
		num2 = j;
		operation = "Nothing";
		
	}
	public Cab(int i, int j, String op)
	{
		num1 = i;
		num2 = j;
		operation = op;
		
	}
}
							
public class ConstructorOverloading 
{

	public static void main(String[] args) 
	{
		Cab obj = new Cab(4,5,"Add");		// this concept is calling Constructor Overloading.

		
		
		
	}
}
		