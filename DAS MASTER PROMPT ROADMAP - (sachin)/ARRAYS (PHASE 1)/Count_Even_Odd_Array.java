import java.util.Scanner;

public class Count_Even_Odd_Array {
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
        System.out.print("Array : ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();


        int countEven = 0;
        int countOdd = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) countEven++;
            else countOdd++;
        }

        System.out.println("Even Elements = "+countEven);
        System.out.println("Odd Elements = "+countOdd);

        sc.close();
    }
}
