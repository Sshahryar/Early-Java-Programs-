import java.util.Scanner;

public class CircleCirc {
   
   public static void main(String args[]){
      
      double radius;
      double π;
      double circumference;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the radius of the circle: ");
      radius = sc.nextDouble();
      
      π = 3.14;
      
      circumference = 2*π*radius;
      
      System.out.println("Circumference of the circle is: "+circumference);

      sc.close();

   }
}
