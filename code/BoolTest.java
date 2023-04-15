// Demonstrate boolean values.
class BoolTest {
  public static void main(String args[]) {
  boolean b;
  b = false;
   System.out.println("b is " + b);
  b = true;
   System.out.println("b is " + b);
   // a boolean value can control the if statement
    if(b) System.out.println("This is executed.");
    b = false;
    if(b) System.out.println("This is not executed.");
    // outcome of a relational operator is a boolean value
     System.out.println("10 > 9 is " + (10 > 9));
	 
	   System.out.println( (10 < 9));
}
}





/*class Square1
{
	public static void main (String args [] )
	{
		int x = 10;
		if (x == 10)
			
			{
				 int y =20;
				 System.out.println("X & y :" + x  " "  + y);
				 x = y*2;
				 
			}
			System.out.println("x is " + x);
	}
}
*/
class Scope2 {
public static void main(String args[]) {
int x; 
x = 10;
if(x == 10)
	{

       int y = 20; 
       System.out.println("x and y: " + x +  " " + y);
       x = y * 2;
}
System.out.println("x is " + x);
}
}
