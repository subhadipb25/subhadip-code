
/*
           
           * 
           * 
         * * 
       * * * 
     * * * * 
   * * * * *
 * * * * * *
 
 
 */


public class NestedLoopRightSidedTriangle 
{

	public static void main(String[] args) 
	{
		int n = 6;
		{
			for (int i=1;i<=n;i++) 
			{
				for(int j=i;j<=n;j++)   // Decreasing triangle method
				{
					System.out.print(" ");  // in quotation with one space
				}
				   for (int j=1;j<=i;j++)   // Increasing triangle method
				{
					System.out.print("*"); // in quotation no space
				}
					System.out.println();
			}
		}
		
		}
	}

