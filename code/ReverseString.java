import java.util.Scanner;
 
public class ReverseString
{
 public static void main(String[] args)
 {
	 
 System.out.println("Enter string to reverse:");
 
 Scanner read = new Scanner(System.in);
 String str = read.nextLine();
 String reverse = "";
 
 
 for(int i = str.length() - 1; i >= 0; i--)
 {
 reverse = reverse + str.charAt(i);
 }
 
 System.out.println("Reversed string is:");
 System.out.println(reverse);
 }
}


class task1{
	public static void main(String args[]){
		String a="Welcome";
		char  ch[] =a.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
			System.out.print(ch[i]);
	}
}
