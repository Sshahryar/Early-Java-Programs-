import java.util.Scanner;

class TempConvert{

	public static void main(String arg[])	{

	double a;

  try (Scanner sc = new Scanner(System.in)) {
	System.out.print("Enter Fahrenheit temperature: ");
  a=sc.nextDouble(); }

	System.out.println("Celsius temperature is: "+celsius(a)); }

	static double celsius(double f)	{

  return  (f-32)*5/9;
	
	}
}
