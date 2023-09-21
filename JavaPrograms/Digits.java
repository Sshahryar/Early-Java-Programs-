package JavaPrograms;

import java.util.Scanner;

 public class Digits {
 public static void main(String[] args) {
     
     int num, ten, one;
  
     Scanner input=new Scanner(System.in);
   
     System.out.print("Enter a two digit number: ");
     num=input.nextInt();
   
     input.close();
  
     ten= num/10;
     one= num%10;
  
     System.out.println("Tens place = "+ ten);
  
     System.out.println("Ones place = "+ one);
  
   }
 }
