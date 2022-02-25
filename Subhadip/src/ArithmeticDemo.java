
public class ArithmeticDemo {

	/*
	 * Arithmetic +,-,*,/,%
	 */
	public static void main(String[] args) 
	{
		int m=100, n=17;
		int r1 = m+n; //8
		int r2 = m-n; //4
		int r3 = m*n; //12
		int r4 = m/n; //3 // if you get  only quotient part not decimal  part;
		double r5 = (double)m/n; //3 // you get the decimal part also;
		
		int r6 = m%n; // you get the remainder part;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		
		
		

	}

}
