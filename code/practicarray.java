	public class practicarray
	{
	public static void main(String args[])
	{
		
		double percent[][]; // Declaring  Array
		percent = new double[][]; // Instantiation of array

		percent[0][0] = 67.65;  // Initialization
		percent[0][1] = 87.15;
		percent[0][2] = 61.45;
		percent[0][3] = 77.12;
		percent[0][4] = 59.31;

		
		

		 double sum= 0;
		  double per=0;
	

		for(int r=0; r<=1; r++) {     // row
			for(int c=0;c<percent.length;c++) {  // column
			    sum=sum+percent[0][0];
				System.out.print(percent[r][c] + "\t");
			}
			
			System.out.println( sum);
		}

		
		
	}
}