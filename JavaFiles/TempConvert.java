package JavaFiles;/* JavaFiles.TempConvert.java
* Sshahryar
* Create a TempConverter application that converts a Fahrenheit temperature to the corresponding Celsius temperature. 
* The formula for converting Fahrenheit to Celsius is C= 5/9(F – 32). The application should prompt the user for the Fahrenheit temperature. Be sure to carefully form the expression. 
* Parentheses will be needed to specify the order of operations.
*/

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
