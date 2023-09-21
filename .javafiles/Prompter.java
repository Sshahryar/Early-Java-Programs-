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
