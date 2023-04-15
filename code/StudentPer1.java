public class StudentPer1
{
	public static void main(String ar[])
	{
		double percent[][]=
		{
			{5, 6, 7, 8},
			{5, 6, 7, 8},
			{5, 6, 7, 8},
			{5, 6, 7, 8},
			{5, 6, 7, 8},
		};
		double rowTotal=0;
		for(int i=0; i<percent.length;i++)
		{
			rowTotal +=percent[1][0];
		}
		System.out.println(rowTotal);
	}
}


 class arrayp
{
	public static void main(String ar[])
	{
		int [][] num =
		{
		{ 1, 2, 3, 4 },
	    { 1, 5, 3, 4 },
		{ 1, 2, 3, 4 },
		{ 1, 2, 3, 4 }
	};
	int rowTotal = 0;
    int colmTotal = 0;
	for( int i= 0; i < num.length; i++){
		rowTotal += num[0][i];
	      for(int j= 0; j < num.length;j++ ){
			  	colmTotal += num[0][j];
			  
		  }
			  
		System.out.println(rowTotal);
	System.out.println(colmTotal);
	}
	
	
	
}
}
		
			