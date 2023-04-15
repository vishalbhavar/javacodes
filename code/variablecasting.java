public class VariableCasting 
{
	public static void main(String ar[])
	{
		int a = 30;
		byte b = (byte) a; // explicit casting
		long c = a; // implicit casting
		

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


		long x = 10;
		short y = (short) x;// explicit casting
		double z = x; // implicit casting 

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}
} 