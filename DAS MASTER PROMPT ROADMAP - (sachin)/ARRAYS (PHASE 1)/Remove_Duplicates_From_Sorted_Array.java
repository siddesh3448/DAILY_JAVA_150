import java.util.Scanner;

public class Remove_Duplicates_From_Sorted_Array {
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

        System.out.print("Array before : ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int k = 1;
        

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println();
        System.out.print("Array After : ");

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
