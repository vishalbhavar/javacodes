import java.util.Scanner;
public class ScannerInput
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st number: ");
		int num1 = scan.nextInt();

		System.out.println("Enter 2nd number: ");
		int num2 = scan.nextInt();
		
		System.out.println(  num1 + num2);
	}
}


class CommandLineArg
{
	public static void main(String args[])
	{
		System.out.println("Command Line Argument Example...");
		System.out.println(args[0]);
		int num1 = Integer.parseInt(args[1]);
		int num2 = Integer.parseInt(args[2]);
		double num3 = Double.parseDouble(args[3]);

		System.out.println(num1 + num2 + num3); 

	}
}

