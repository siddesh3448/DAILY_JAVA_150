/* 
DSA Day 2 — Next question
Question 3: Find the Second Largest Element
Filename: SecondLargestElement.java
Problem: Given an integer array, find the second-largest distinct element.
Example 1
Input: {12, 35, 1, 10, 34, 1}
Output: 34
Example 2
Input: {5, 5, 5}
Output: No second-largest distinct element exists.
Requirements
1. Use a class, object, and constructor, following your practice style.
2. Store the array in an instance variable.
3. Create a method to find the second-largest distinct element.
4. Display the result, including when no such element exists.
5. Test arrays with duplicate values and negative numbers.
*/

class SecondLargest {
    int[] array;
    int max;
    int sec_max;
    boolean hasSecond;

    SecondLargest(int[] array) {
        this.array = array;
    }

    int SecondMax() {
        if (array.length == 0) {
            max = sec_max = 0;
            hasSecond = false;
            return sec_max;
        }

        max = array[0];
        hasSecond = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                sec_max = max;
                max = array[i];
                hasSecond = true;
            } else if (array[i] < max && (!hasSecond || array[i] > sec_max)) {
                sec_max = array[i];
                hasSecond = true;
            }
        }
        return sec_max;
    }

    void displayResult(){
        SecondMax();
        if(!hasSecond){
            System.out.println("No second-largest distinct element exists.");
            return;
        }else{
            System.out.println(sec_max);
        }
    }
}

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { -10, -3, -7, -3, -15 };

        SecondLargest call = new SecondLargest(arr);

        call.displayResult();
    }
}
