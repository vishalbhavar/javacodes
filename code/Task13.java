import java.util.Scanner;
 

class Task13{

    static void findAge(int current_date, int current_month,

                    int current_year, int birth_date,

                    int birth_month, int birth_year)

    {

        int month[] = { 31, 28, 31, 30, 31, 30, 31, 

                             31, 30, 31, 30, 31 };

        if (birth_date > current_date) {

            current_month = current_month - 1;

            current_date = current_date + month[birth_month - 1];

        }

        if (birth_month > current_month) {

            current_year = current_year - 1;

            current_month = current_month + 12;
     }


        int calculated_date = current_date - birth_date;

        int calculated_month = current_month - birth_month;

        int calculated_year = current_year - birth_year;
 

        System.out.println("Present Age");


        System.out.println("Years: " + calculated_year + 

              " Months: " + calculated_month + " Days: " + 

              calculated_date);

    }

    public static void main(String[] args)
   {
       	Scanner scan = new Scanner(System.in);
		  int current_date;
          System.out.println("Enter Current date");
          current_date=scan.nextInt();
      

        int current_month;
		 System.out.println("Enter Current month");
         current_month=scan.nextInt();
       

        int current_year ;
		System.out.println("Enter Current year");
         current_year=scan.nextInt();
 
 
        Scanner scan1 = new Scanner(System.in);

        int birth_date;
		 System.out.println("Enter birth date");
         birth_date=scan1.nextInt();
          

        int birth_month;
		 System.out.println("Enter birth month");
        birth_month=scan1.nextInt();
      

        int birth_year;
		System.out.println("Enter birth year");
        birth_year=scan1.nextInt();
		
		findAge(current_date, current_month, current_year,

              birth_date, birth_month, birth_year);
    }
}