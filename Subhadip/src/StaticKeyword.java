class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static			// in static blog when you load a class
	{
		ceo = "Subha";
		System.out.println("in static");
	}
	
	public Emp()      //when you create an object
	{
		eid =1;
		salary = 3000;
		System.out.println("in constructor");
		
	}

	
	public void show()
	{
		System.out.println(eid + ":" + salary + ":" + ceo);
	}
}


public class StaticKeyword {

	public static void main(String[] args) 
	{
		   Emp ram = new Emp();
		   ram.eid = 8;
		   ram.salary = 5000;
		   ram.ceo = "Mukul";
		    
		   Emp rahul = new Emp();
		   rahul.eid = 9;
		   rahul.salary = 10000;
		   Emp.ceo = "mukul";  // we don't need object
		   
		   Emp.ceo = "shila";
		   
		   
		   ram.show();
		   rahul.show();
		   
		   
				   

	}

}
