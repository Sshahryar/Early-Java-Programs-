package JavaFiles;/* JavaFiles.CircleCirc2.java
 * Sshahryar
 * Create a CircleCircumference application the calculates and displays the circumference of a circle. The application should prompt the user for the value of the radius. 
 * The circumference of a circle is calculated as 2πr. 
 * Use variables and constants as appropiate.
 */

import java.util.Scanner;

public class CircleCirc2 {
   
   public static void main(String args[]){
      
      double radius;
      double π;
      double circumference;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the radius of the circle: ");
      radius = sc.nextDouble();
      
      π = 3.14;
      
      circumference = 2*π*radius;
      
      if (radius <0) {
         System.out.println( "Negative radii are illegal.");
       } else if(radius >0){
          System.out.println( "Circumference of the circle is: "+circumference);

          sc.close();
          
      }
   }
}
