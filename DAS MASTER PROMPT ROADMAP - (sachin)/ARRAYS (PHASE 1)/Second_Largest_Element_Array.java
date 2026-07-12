import java.util.Scanner;

public class Second_Largest_Element_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Array : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        boolean isFound = false;

        int max = arr[0];
        int sec_max = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] > sec_max && arr[i] != max) {
                sec_max = arr[i];
                isFound = true;
            }
        }

        System.out.println();

        if (!isFound) {
            System.out.println("Second Largest Element Not Found");
        } else if(isFound = true) {
            System.out.println("Second Largest = " + sec_max);
        }

        sc.close();
    }
}
