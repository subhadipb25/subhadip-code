
/*
 * 
 * Inner class
 * Member class
 * Static class
 * Anonymous
 * 
 * 
 */





class Outer
{
	static int a;
	public static void show()
	{
		
	}

 	static class Inner 		//outer$Inner.class
 	{
 	  	public void display()
 	  	{
 	  		System.out.println("in display");
 	  	}
 	}

}

public class InnerClass 
{
	
	// variable ,  method , class

	public static void main(String[] args) 
	{
		
			Outer obj = new Outer();
			obj.show();
			
			Outer.Inner obj1 = new Outer.Inner();
			obj1.display();
			
			
			
			
	}

}
