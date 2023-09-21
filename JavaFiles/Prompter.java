package JavaFiles;/* JavaFiles.Prompter.java
 * Sshahryar
 * Create a prompter application the user for two numbers. The first number is a min value and the second is a max value. JavaFiles.Prompter then prompts the user for a number between the min and max numbers entered.
 * The user should be continually prompted until a number within the range is entered. Be sure to include the min and max numbers in the prompt.
*/

import java.util.Scanner;

public class Prompter { 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); {

            int min, max, num;

               System.out.print("Enter a minimum number: "); 
                min = input.nextInt();

                System.out.print("Enter a maximum number: "); 
               max = input.nextInt();

                do { 
                    System.out.print("Enter a number between "+min+" and "+max+": "); 
                    num = input.nextInt();
                } while ((num < min)||(num > max));
        }

    }
}
