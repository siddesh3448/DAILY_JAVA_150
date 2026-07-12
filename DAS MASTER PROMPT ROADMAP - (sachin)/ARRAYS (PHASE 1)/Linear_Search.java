import java.util.Scanner;

public class Linear_Search {
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

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element Found at Index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}