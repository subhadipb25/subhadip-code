
public class Array2d 
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int b[] = {5,6,7,8,9};
		int c[] = {9,0,0,9,0};
		int d[] = {8,7,6,5,4};
		int e[] = {4,3,2,1,0};
		
		
		 int f[][] = {
				 		{1,2,3,4,5},
				 		{5,6,7,8,9},
				 		{9,0,0,9,0},
				 		{8,7,6,5,4},
				 		{4,3,2,1,0}
		 			};
				 		 
		 
		 for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(" "+ f[i][j]);	
			}
			System.out.println();
		}
		

		 
class ArrayAnotherForm
{
	
}
			int A[] = {1,2,3,4,5};
			int B[] = {5,6,7,8,9};
			int C[] = {9,0,0,9,0};
			int D[] = {8,7,6,5,4};
			
	 int F[][] = 
		 {
		 		
			 	{1,2,3,4,5},
		 		{5,6,7},				//when Row and Column are not same that array are called Jagged Arrays
		 		{9,0,0,9,0},
		 		{8,7,6,5,4},
		 		
			};			
	 
	 
	 for(int i=0; i<F.length; i++)
	{
		for(int j=0; j<F[i].length; j++)
		{
			System.out.print(" "+ F[i][j]);	
		}
		System.out.println();
	}
}
}



	 
	 
