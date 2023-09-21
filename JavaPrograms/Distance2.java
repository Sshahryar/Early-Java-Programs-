import java.util.Scanner;

public class Distance2  {

    public static void main(String[] args) {

        double length1;  //Length of segment 1
        double length2;  //Length of segment 2
        double length3;  //Length of segment 3

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length1: ");
        length1=input.nextDouble();

        System.out.print("Enter the length2: ");
        length2=input.nextDouble();

        System.out.print("Enter the length3: ");
        length3=input.nextDouble();

        double distance = length1 + length2 + length3;

        System.out.print("Enter the name:  ");

        String name;
        name = input.next();

        input.close();

        System.out.println(name + " ran these many kilometers = " + distance);

    }
}