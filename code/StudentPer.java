/*
Create an array which can hold the 5 students 4 subject marks.
Print the Marks of every student in table format along with the percent.
	Also Print the Grade of the Student.
	And Also print the Highest Percentage.
*/
public class StudentPer
{
	public static void main(String ar[])
	{
		double percent[][]=
		{
			{70, 80, 75, 90},
			{65, 81, 82, 88},
			{45, 51, 96, 88},
			{46, 52, 51, 77},
			{100, 100, 100, 100},
		};
		{
			for(int r=0;r<=4;r++) {     
				for(int c=0;c<=3;c++) {  
					System.out.print(percent[r][c] + "\t");
			}
				System.out.println();
				}
				System.out.println();
		}
		double rows,column,sumRow,sumColumn;
		rows=percent.length;
		column=percent[0].length;
		for(int i=0; i<rows; i++)
		{
			sumRow=0;
			for(int j=0;j<column;j++)
			{
				sumRow=sumRow+percent[i][j];
			}
			System.out.println("Sum of "+(i+1)+"row:"+sumRow);
			double sum,per;
			double hig= 0;
			{
				per = sumRow*100 / 400;
				  System.out.println("average of percentage  "  +per);
				  	if( per > hig )
					 {
						 System.out.println("highest  percentage of student "  + hig);
					 }
						 
			}
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
		   System.out.println("Gread B");
	   }	
	   else if(per >= 81 && per <= 100)  
	   {
		   System.out.println(" Gread A");
	   }
	}
      
}
}

