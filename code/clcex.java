public class clcex
{
	public static void main(String args[])
	{
		System.out.println("Main Method Starts..");

		//Calculation cal = new Calculation(); // reference variable and Object
		
		clcex cal = new clcex(); // reference variable
	 // Object
		
		cal.add(12,3);
		 cal.sum();
		 int val = cal.mul();
		 cal.div(val , 20 );
		System.out.println("Main Method Ends..");
	}

	public void add(int n1, int n2)
	
	
	{
		int ans = n1 + n2;
		System.out.println(ans);
	}

	public void sum()
	{
		int a =10;
		int b =20;
		int ans = a+b;
	    System.out.println(ans);
	}
   public int mul()
   {
		int a = 10;
		int b = 3;
		int ans = a*b;
		System.out.println(ans);
		return ans;   
   }
   public double div(double n1 ,double n2)
   {
	  double ans = n1/n2; 
	  System.out.println(ans);
	  return ans; 
   }
}
