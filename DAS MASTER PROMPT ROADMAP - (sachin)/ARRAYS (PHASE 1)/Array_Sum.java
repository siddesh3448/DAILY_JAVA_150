import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();

        System.out.println();

        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print((i+1)+" element : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println();

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Sum = "+sum);

        sc.close();
    }
}
