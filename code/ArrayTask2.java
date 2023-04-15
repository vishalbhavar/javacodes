/*
Create an array which can hold the 5 students 4 subject marks.
Print the Marks of every student in table format along with the percent.
	Also Print the Grade of the Student.
	And Also print the Highest Percentage.
*/
public class ArrayTask2
{
	public static void main(String ar[])
	{
		double percent[][]=
		{
			{70, 80, 75, 90},
			{65, 81, 82, 88},
			{45, 51, 96, 88},
			{45, 51, 96, 88},
			{100,100, 100, 100}
		};
		 double max = 0;
		  for(int r=0; r <percent.length; r++){
			  double per =0;
			  double sum =0;
			  for(int c=0;c<percent[r].length; c++){
				 System.out.print(percent[r][c] + "\t");
				 sum = sum + percent[r][c];
				 
				 }
				 per =(sum/400)*100;
				 System.out.print(per + "%");
				 if(per > max){
				max = per;
				 }
				 
			           	 // gread
		 if(per >= 1 && per <= 40)  
	          {
		        System.out.println("sorry you are fail");
	           }	
	    else if(per >= 41 && per <= 60)  
	        {
		       System.out.println(" Gread C");
	        }	
	    else  if(per >= 61 && per <= 80)  
	       {
		     System.out.println("  Gread B");
	       }	
	   else if(per >= 81 && per <= 100)  
	      {
		     System.out.println(" Gread A");
	      }
				 System.out.println();
		}
		  System.out.println(max);
	}
}