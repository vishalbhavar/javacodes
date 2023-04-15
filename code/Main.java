//using break

//Java Program to see the implementation of break statement
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        //Declare variables
        int num, sum = 0;
        //Take input from the user
        // create an object of Scanner
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            // initialize the elements
            num = sc.nextInt();
            // if number is negative then the loop terminates
            if (num < 0) 
            {
                break;
            }
           sum += num;
        }
        System.out.println("The sum of all positive numbers is = " + sum);
    }
}