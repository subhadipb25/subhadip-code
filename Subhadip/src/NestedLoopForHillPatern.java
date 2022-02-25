
// NO.6) Nested Loop FOR HILL PATERN

/*
         *
       * * * 
     * * * * *
   * * * * * * *
 * * * * * * * * *
       
 */


public class NestedLoopForHillPatern {

	public static void main(String[] args) {
		
		
		
		int n =6;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++) 
			{
				System.out.print(" ");	
			}
			for(int j=1;j< i;j++)
			{
				System.out.print("*");
			}
			for(int K=1;K<=i;K++)
			{
				System.out.print("* ");
			}
				System.out.println();
		
		}


	}

}
