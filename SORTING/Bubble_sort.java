import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.print((i+1)+" element");
            arr[i] = sc.nextInt();
        }

        System.out.print("Before sort : ");
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if()
            }
        }
        System.out.println();
    }
}
