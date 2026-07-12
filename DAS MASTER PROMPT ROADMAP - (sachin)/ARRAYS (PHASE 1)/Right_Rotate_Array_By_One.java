import java.util.Scanner;

public class Right_Rotate_Array_By_One {
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

       int temp = arr[arr.length-1];

       for(int i=arr.length-1;i>0;i--){
        arr[i] = arr[i-1];
       }
       arr[0] = temp;

       System.out.print("After One Left Rotate : ");

      for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
