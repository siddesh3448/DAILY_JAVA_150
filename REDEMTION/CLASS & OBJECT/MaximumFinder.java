/* Problem 4 — Find the Maximum
Easy

Objective: Practise classes, constructors, objects, and returning a calculated result.
Requirements:
1. Create a class named MaximumFinder.
2. Declare two instance variables, num1 and num2, of type int.
3. Create a constructor that initializes both variables.
4. Create a method findMaximum() that returns the larger number.
5. Create a method displayResult() that prints both numbers and the maximum.
6. In main(), create three objects and test (10, 20), (35, 12), and (7, 7).
Filename: MaximumFinder.java
*/

import java.util.Scanner;

class Max {
    int num1; int num2;

    Max(int num1, int num2){
        this.num1 = num1; this.num2 = num2;
    }

    int findMaximum(){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    void displayResult(){
        System.out.println("Maximum in "+ num1 + " & "+ num2 + " ---> "+ findMaximum());
    }
}

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you First number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter you Second number : ");
        int num2 = sc.nextInt();

        Max ans = new Max(num1, num2);

        ans.displayResult();

        sc.close();
    }
}
