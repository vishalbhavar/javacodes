import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        double d = scan.nextDouble();
        int i = scan.nextInt();

        // Write your code here.
        System.out.println("Int: " + i);
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
      
        scan.close();
    }
}