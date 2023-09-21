import java.util.Scanner;

public class SurfUp  {
    
    public static void main(String[] args)  {    
        
        int height;
        
        Scanner input = new Scanner(System.in);  

        System.out.print("Enter wave height in feet: ");
        height=input.nextInt(); 
        input.close();

        if (height >=78){
            System.out.println( "Are you trying to break a record? The world record is 78 feet!"); 
        } else if (height >=6){
            System.out.println( "Great day for surfing!");
        } else if(height>=3){
            System.out.println( "Go body boarding!");
        } else if(height>=0){
            System.out.println( "Go for a swim.");
        } else{
            System.out.println( "Whoa! What kind of surf is that??");
           
        }
    }
}
    
