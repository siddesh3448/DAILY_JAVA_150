/*
Problem 4: Find the Largest Element in an Array
Largest Element Using a Class and Object

Difficulty: Easy · Java · Arrays + OOP
Problem statement
Create a Java program that finds the largest element in an integer array using a class, constructor, and instance methods.
Requirements
1. Create a class named ArrayMaximum.
2. Store the array in an instance variable.
3. Pass the array to the constructor.
4. Create an instance method findMaximum() that returns the largest element.
5. Create an instance method displayResult() that prints the result.
6. In main(), create an array, create an object, and call displayResult().
Example 1
Input: [12, 25, 7, 40, 18]
Output: Largest element = 40
Example 2
Input: [-8, -3, -15, -2]
Output: Largest element = -2
Constraints
- Assume the array contains at least one element.
- Do not use Arrays.sort() or any built-in method to find the maximum.
- Use a loop to find the largest element.
- Do not write the entire solution inside main().
- Do not copy code from another solution.
*/

import java.util.Scanner;

class ArrayMaxElement {

    int[] array;
    int maxElement = Integer.MIN_VALUE;

    ArrayMaxElement(int[] array) {
        this.array = array;
    }

    int findMaximum(){
        int i = 0;
        while(i<array.length){
            maxElement = Math.max(maxElement, array[i]);
            i++;
        }
        return maxElement;
    }

    void displayResult(){
        System.out.println("Largest element = "+findMaximum());
    }
}

public class ArrayMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+" element : ");
            arr[i] = sc.nextInt();
        }

        ArrayMaxElement obj = new ArrayMaxElement(arr);

        obj.displayResult();

        sc.close();

    }
}
