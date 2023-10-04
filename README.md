# Early-Java-Programs-

First-ever Java programs I made from 2022-2023.

Salvaged, fixed, and revamped programs from old high school class taken in 2022-2023, personal info and classmate collaborations were removed.

Programs prompts from "A Guide To Programming in Java: Java 2 Platform Standard Edition 5".

__

# The Programs (Programs in .javafiles folder): 

## 1. bingocard.java

### Description: 

bingocard.java was my first ever java program, it is a simple application that prints out a simple bingo ruleset such as that in a bingo card:

1. The caller randomly pulls a numbered bingo hall.
2. The number is placed on the bingo board and called out.
3. Players look for for the called number on their bingo card.
4. If the number is located, it is marked off.
5. Steps 1 to 4 are repeated until a player matched the BINGO pattern.
6. The winning player yells BINGO.

### Source Code:

        public class bingocard {
        
        public static void main(String[] args) {
     
        System.out.println("Bingo Rules\n");
        System.out.println("1. The caller randomly pulls a numbered bingo hall.\n");
        System.out.println("2. The number is placed on the bingo board and called out.\n");
        System.out.println("3. Players look for for the called number on their bingo card.\n");
        System.out.println("4. If the number is located, it is marked off.\n");
        System.out.println("5. Steps 1 to 4 are repeated until a player matched the BINGO pattern.\n"); 
        System.out.println("6. The winning player yells BINGO.\n");

        } 
        }

### Output: 

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/4c826b24-0fd2-4a3a-93cf-2b68073164af)

__

## 2. Distance2.java

### Description: 

Calculates and displays the total distance of a race with three segments based on the distance of each race segment entered by the user.

### Source Code:

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
    
### Output:

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/63916fe8-0dd9-42b8-86d6-da295dd56242)

In this scenario of the code, the first length was entered as 10(km), the second length as 15(km), and the third as 20(km), then ended with the runner's name entered as Sshahryar. 

__
    
## 3. RectanglePerimeter.java

### Description: 

Calculates and displays the perimeter of a rectangle with a length of 13 and a width of 4.

### Source code:

        import java.util.Scanner;

        public class RectanglePerimeter  {
    
        public static void main(String[] args) {
    
        int length = 13; //longer side of rectangle
        int width = 4; //shorter side of rectangle
        int perimeter; //calculated perimeter of rectangle                                  

        perimeter = 2 * length + 2 * width;
        
        System.out.println("Perimeter of rectangle:  " + perimeter); 

        }
        }

### Output: 

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/9563aabd-b21d-4f03-b8ab-43b40980d9f4)

__

## 4. CircleCirc.java

### Description:

Create a CircleCircumference application the calculates and displays the circumference of a circle. 
The application should prompt the user for the value of the radius. The circumference of a circle is calculated as 2πr. Use variables and constants as appropriate.

### Source Code:

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

### Output:

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/83ba8889-0456-4f63-9b28-499de8222f4f)

In this scenario of the code, the radius was entered as 88. 

__

## 5. CircleCirc2.java

### Description: 

Like CircleCirc.java, however, returns "Negative radii are illegal." upon the user entering negative radii. 

### Source Code: 

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

### Output: 

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/b92e0ac7-3aaf-48d2-9a59-d2569bb43bc8)

When entering negative radii in .CircleCirc2.java you will get the error message: Negative radii are illegal. Contrary to CircleCirc.java

__

## 6. Digits.java

### Description:

Create a Digits application that prompts the user for a two-digit number and then displays the digits in the ones-place and tens-place.

### Source code:
 
        import java.util.Scanner; 
  
        public class Digits {

        public static void main(String[] args{ 

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

### Output:

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/70c1ca0f-47ef-451e-8b5a-5bf03a8c308a)

In this scenario of the code, the two-digit number was entered as 56.

__

## 7. SurfUp.java

### Description:

Create a SurfsUp application that prompts the user for the wave height and then displays an appropriate activity for the wave height. 

### Source code:
        
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

### Output:

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/1635e0c6-55ce-4d10-b79a-9b815d81c239)

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/37333796-13e2-4b38-b786-5b78a8faac74)

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/ffc95c81-0276-4650-bb05-0bd4476dfa0d)

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/4659c9e6-33ac-4328-8800-3917921bd0b6)

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/a7cf14e2-a897-423e-979a-a6c37421364f)

When entering a wavelength of 78 or above the user will get the message: "Are you trying to break a record? The world record is 78 feet!"

When entering a wavelength of 6 or above the user will get the message: "Great day for surfing!"

When entering a wavelength of 3 or above the user will get the message: "Go body boarding!"

When entering a wavelength of 0 or above the user will get the message: "Go for a swim."

When entering a wavelength of negative integer (-1 and below) the user will get the message: "Whoa! What kind of surf is that??"

__

## 8. TempConvert.java

### Description:

Create a TempConverter application that converts a Fahrenheit temperature to the corresponding Celsius temperature. 

The formula for converting Fahrenheit to Celsius is C= 5/9(F – 32). The application should prompt the user for the Fahrenheit temperature. Be sure to form the expression carefully. 

Parentheses will be needed to specify the order of operations.

### Source Code:

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

### Output:

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/f7d438ec-7f6f-42d8-8f63-7f96bb3d315b)

In this scenario of the code, the Fahrenheit temperature was entered as 60.

## 9. Prompter.java

### Description:

Create a prompter application the user for two numbers. 
The first number is a min value and the second is a max value.
Prompter then prompts the user for a number between the min and max numbers entered.
The user should be continually prompted until a number within the range is entered. 
Be sure to include the min and max numbers in the prompt.

### Source code: 

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

### Output:

![image](https://github.com/Sshahryar/Early-Java-Programs-/assets/123003299/37a940ac-2ac9-408e-91bc-fe7a58bea749)

## 9. Stages.java

### Description:

Create a Stages application that prompts the user for an age. For an age over 18, adult is diplayed. 
For an age less than or equal to 18, toddler is displayed when the age is less than or equal to 5, child when the age is less than or equal to 10, preteen when the age is less than or equal to 12, and teen when the age is over 12.

### Source code:

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

### Output:



