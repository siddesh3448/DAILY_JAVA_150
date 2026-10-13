/* Build an Even Number Checker
Easy

Your requirements:
1. Create a class named EvenNumberChecker.
2. Add an instance variable number of type int.
3. Create a constructor that accepts a number and initializes the instance variable.
4. Create a method isEven() that returns a boolean.
5. Create a method displayResult() that prints whether the number is even or odd.
6. In main(), create at least three objects and test 6, 9, and 0.
Filename: Check_Even_Number.java

*/
import java.util.Scanner;

class EvenNumberChecker { 
    int number; 

    EvenNumberChecker(int number){
        this.number = number;
    }

    boolean isEven(){
        return number % 2 == 0;
    }

    // void displayResult(){
    //     System.out.println(isEven() ? "EVEN ---> " + number : "ODD ---> " + number);
    // }
}

public class Check_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        
        EvenNumberChecker num = new EvenNumberChecker(number);
        
        System.out.println(num.isEven() ? "EVEN ---> " + number : "ODD ---> " + number);
        // num.displayResult();
        sc.close();
    }
}
