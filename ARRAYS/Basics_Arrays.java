package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;

public class Basics_Arrays {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Element : ");
            arr[i] = in.nextInt();
        }
        System.out.print("Your Finaly Array is :-> ");
        System.out.println(Arrays.toString(arr));

        in.close();
    }
}

