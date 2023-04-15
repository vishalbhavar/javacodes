/*
	1 2 3 4
	1 2 3 4
	1 2 3 4
	1 2 3 4
*/
public class NestedForLoop
{
	public static void main(String args[])
	{
         for(int r=1 ; r<=4; r++ )
		 { // ROW

			for(int c=1 ; c <=4; c++)
				{  // Column

				System.out.print(c + " ");
			    }

			    System.out.println( );
			
		    }
	}
}




 class  NestedForLoop3
{
	public static void main(String args[])
	{
	  for(int r=4 ; r>=1; r-- )
		  {
		    for(int c=4 ; c >=r; c--)
				{
					System.out.print(c+ " ");
				}
				System.out.println();
			}
		}
}