
class Xyz
{
	int num1;
	int num2;
	int result;
	
	public Xyz(int num1,int num2)
	{
		this.num1 = num1;  // this keyword is a current object
		this.num2 = num2;
	}
}


public class Keyword {

	public static void main(String[] args) 
	{
		Xyz obj = new Xyz(4,5);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
