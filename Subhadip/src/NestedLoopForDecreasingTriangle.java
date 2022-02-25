
 // no.2) Print Decreasing Triangle using star

/*
 

 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 

 */


//****


public class NestedLoopForDecreasingTriangle
{

	public static void main(String[] args) 
	{
		int n=6;
		{
			for(int i=1;i<=n;i++)  // outer Loop i 1 to n
			{
				for(int j=i;j<=n;j++)  // nested loop j i to n  in decreasing triangle
				{
					System.out.print("* ");  // this line has open & close second bracket
				}
						System.out.println(); // and this line has only closed second bracket
					}
				}
			}
		}


