import java.util.Scanner;

public class Left_Rotate_Array_By_One {
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

        System.out.print("Before Array : ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 
        System.out.println();
        System.out.println();

       int temp = arr[0];

       for(int i=1;i<arr.length;i++){
        arr[i-1] = arr[i];
       }

       arr[size-1] = temp;

       System.out.print("After One Left Rotate : ");

      for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
