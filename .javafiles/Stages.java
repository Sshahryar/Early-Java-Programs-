package JavaPrograms;

import java.util.Scanner;

public class Stages {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = inp.nextInt();

        if(age >= 18){
            System.out.println("You are an adult");
        }

        else if(age >= 13){
            System.out.println("You are a teenager");
        }
        
        else if(age >= 12){
            System.out.println("You are a preteen");
        }

        else if(age >= 9){
            System.out.println("You are a child");
        }

        else if (age >=3){
            System.out.println("You are a toddler");

        }

        else if(age >=2){
            System.out.println("You are a baby");

        }

        else if(age >=0){
            System.out.println("ERROR! Negative age entered.");

        }

        }
    }
    
