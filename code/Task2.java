import java.util.Scanner;
public class Task2 {
  public static void main(String arr[]){
  String s4 = "vishal-janardhan-bhavar";
		String strs[] = s4.split("-");
		 System.out.println(s4);
		  
			System.out.println();
			System.out.println("output string ");
			System.out.println(" ");
		   System.out.println(s4.substring(17));		
		    System.out.println(s4.substring(7,16));
	    	System.out.println(s4.substring(0,6));
	}
}


class ETask2
{
    public static void main(String args[])
 {
     System.out.println("Enter the name  ");
	 Scanner sc= new Scanner(System.in);
    String s1 = " ";
    s1=sc.next();
    String strs[] = s1.split("-");
    System.out.println("Output :");
    for(int i=strs.length-1;i>=0;i--){
    System.out.print(strs[i] + " ");

  }

 }
}