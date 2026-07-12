import java.util.Scanner;

public class Frequency_Element_Array {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Enter Your Target Element : ");
        int target = sc.nextInt();

        boolean found = false;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element Found at Index " + i);
                found = true;
                count++;
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }else{
            System.out.println("Frequency = "+count);
        }
        sc.close();
    }
}
