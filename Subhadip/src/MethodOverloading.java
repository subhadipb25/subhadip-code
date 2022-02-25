
class Casio
{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	public void add(double i, double j)   // if you have multiple methods with a same name they have different parameters
	{
		System.out.println(i+j);
	}
}
							 // if you have this type of concept and you have different parameters this are called Method Overloading.

public class MethodOverloading {

	public static void main(String[] args) 
	{
		Casio obj = new Casio();
		obj.add(5,2);
		obj.add(4,3,5);
		obj.add(4.5,3.8);
		
				
	}

}
