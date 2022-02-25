
public class EnhanceofForLoop 
{
	private static final int[] K = null;

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40};
		
		
		for(int i=0; i<4; i++)
		{
		
		System.out.println(a[i]);
		}
		
		for(int k : a)						// enhance of for loop in 1D Array
		{
			System.out.print(" " + k);
		}
  
	





	
		
		{
		
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
						System.out.println(" " + F[i][j]);
					}
					System.out.println();
				}
					
					for(int k[] : F)
					{
						for(int l : K) 						//enhance of for loop in 2D Array
						{
							System.out.print(" " + l);
						}
						System.out.println();
					}
						
						
						
						
						
						
						
	}
	}
}