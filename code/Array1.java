
// write a pogram to calculate percentage 
public class Array1
{
	public static void main(String args[])
	{
		double percent[]; // Declaration of Array
		percent = new double[9]; // Instantiation of array
		percent[0] = 77.00; //initia lization of array
		percent[1] = 72.00;
		percent[2] = 62.00;
		percent[3] = 72.00;
		percent[4] = 45.00;
		percent[5] = 76.00;
		percent[6] = 65.00;
		percent[7] = 89.00;
		percent[8] = 83.00;
		
		

		//System.out.println(percent); // [D@762efe5d
		 double sum= 0;
		  double per=0;

		for(int i=0; i< percent.length ; i++)
		{
			System.out.println(percent[i]);
			sum=sum+percent[i];
		}

		
      System.out.println(" total sum  " + sum);
	  
		per=sum*100/800;
		System.out.println( " average percentage  "+ per);
	}
}









/*System.out.println("---------Enhance For Loop---------------");
		for(double p :  percent) 
		{
			System.out.println(p);
		}*/ 