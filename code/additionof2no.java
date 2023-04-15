
//import java.util.Scanner;
public class additionof2no {
public static void main(String[] args) 
{

   // Scanner sc = new Scanner(System.in);	
  //  System.out.println("In how many subject have you given exams?");
  //  int n = sc.nextInt();

		double percent[] = {77.88, 72.81, 62.11, 72.51, 45.81, 76.41};
  //  System.out.println("Enter your marks obtained in subjects:"); 
     for(int i = 0; i < percent; i++) {
	//percent[i] = sc.nextInt();
   }
   int total = 0;
   for(int i = 0; i <= percent; i++) {
	 total += percent[i];  
   }

     System.out.println("Total marks: " +total);

     float percentage = (float)total/percent; 
     System.out.println("Percentage: " +percentage+ "%");
 }
}
