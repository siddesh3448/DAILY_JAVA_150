/*
 Problem 2: Array Traversal
Easy

Filename: ArrayTraversal.java
Problem statement
You are given an integer array. Create a Java program using classes and objects to display every element of the array on a separate line.
Requirements
1. Create a class named ArrayOperations.
2. Declare an integer array as an instance field.
3. Create a constructor that accepts an integer array and initializes the instance field.
4. Create a void method named displayArray() that traverses the array using a for loop and prints each element.
5. In the main class ArrayTraversal, initialize an array with the values given below.
6. Create an object of ArrayOperations and call displayArray() through that object.

Example input
12, 25, 7, 40, 18

Expected output
12
25
7
40
18


Constraints
- Use a for loop for traversal.
- Do not print each element manually.
- Do not use static methods for the array operation.
- Use the constructor to pass the array to the object.
 */

class ArrayOperations{
    int[] arr;

    ArrayOperations(int[] arr){
        this.arr = arr;
    }

    void displayArray(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

public class ArrayTraversal {
    public static void main(String[] args) {

        int[] arr = {12 , 25 , 7 , 40 , 18};

        ArrayOperations array = new ArrayOperations(arr);

        array.displayArray();
    }
}


