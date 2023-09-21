package JavaPrograms;

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
