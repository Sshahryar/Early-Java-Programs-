# Early-Java-Programs-

First-ever Java programs I made from 2022-2023.

Salvaged, fixed, and revamped programs from old high school class taken in 2022-2023, personal info and classmate collaborations were removed.

Programs prompts from "A Guide To Programming in Java: Java 2 Platform Standard Edition 5".

__

## 1. bingocard.java

### Description: bingocard.java was my first ever java program, it is a simple application that prints out a simple bingo ruleset such as that in a bingo card:

1. The caller randomly pulls a numbered bingo hall.
2. The number is placed on the bingo board and called out.
3. Players look for for the called number on their bingo card.
4. If the number is located, it is marked off.
5. Steps 1 to 4 are repeated until a player matched the BINGO pattern.
6. The winning player yells BINGO.

### Source Code:
    
    public static void main(String[] args) {
     
        System.out.println("Bingo Rules\n");
        System.out.println("1. The caller randomly pulls a numbered bingo hall.\n");
        System.out.println("2. The number is placed on the bingo board and called out.\n");
        System.out.println("3. Players look for for the called number on their bingo card.\n");
        System.out.println("4. If the number is located, it is marked off.\n");
        System.out.println("5. Steps 1 to 4 are repeated until a player matched the BINGO pattern.\n"); 
        System.out.println("6. The winning player yells BINGO.\n");

    } 

### Output: 

Bingo Rules

1. The caller randomly pulls a numbered bingo hall.       

2. The number is placed on the bingo board and called out.

3. Players look for for the called number on their bingo card.

4. If the number is located, it is marked off.

5. Steps 1 to 4 are repeated until a player matched the BINGO pattern.

6. The winning player yells BINGO.
   
__

## Distance2.java

### Description: 

Calculates and displays the total distance of a race with three segments based on the distance of each race segment entered by the user.

### Source Code:

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

 ### Output:

Enter the length1: 10

Enter the length2: 15

Enter the length3: 20

Enter the name:  Sshahryar

Sshahryar ran these many kilometers = 45.0

In this scenario of the code, the first length was entered as 10(km), the second length as 15(km) and the third as 20(km).
After adding the runner's name (in this case Sshahryar) the final output is: (Runner name) ran these many kilometers = (km's), in this case: Sshahryar ran these many kilometers = 45.0.

__
    


