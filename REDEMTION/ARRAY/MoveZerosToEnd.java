/*
DSA Day 3 — Practice Block
Quick recall is complete. Now spend 15 minutes on one problem, then 5 minutes on a dry run and 5 minutes recording your progress. Keep the whole block within 30 minutes.
Problem: Move All Zeros to the End
Filename: MoveZerosToEnd.java
Problem statement
Given an integer array, move all zeros to the end while maintaining the relative order of the non-zero elements.
Modify the array in place; do not create another array.
Example 1
Input: {0, 1, 0, 3, 12}
Output: {1, 3, 12, 0, 0}
Example 2
Input: {0, 0, 0}
Output: {0, 0, 0}
Example 3
Input: {4, 2, 1}
Output: {4, 2, 1}
Requirements
- Use a class, object, and constructor, following your practice style.
- Store the array in an instance variable.
- Create a method that modifies the existing array.
- Display the array before and after modification.
- Preserve the order of non-zero elements.
*/

class Zeros {
    int[] array;
    int i;
    int j;

    Zeros(int[] array) {
        this.array = array;
    }

    void ZerosTOEnd() {
        i = 0;
        for (j = 0; j < array.length; j++) {
            if (array[j] != 0) {
                if (i != j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                i++;
            }
        }
    }

    void displayResult() {
        System.out.print("After Moving all the zeros to end Array --> ");x`

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }
}

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };

        Zeros call = new Zeros(arr);

        System.out.print("Before moving zeros --> ");
        
        for (int value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
        System.out.println();

        call.ZerosTOEnd();
        call.displayResult();
    }
}
