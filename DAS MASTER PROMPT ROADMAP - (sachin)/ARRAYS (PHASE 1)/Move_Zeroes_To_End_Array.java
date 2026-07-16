import java.util.Scanner;

public class Move_Zeroes_To_End_Array {
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

        int a = 0;
        int j = 0;


        
        while(a<arr.length){
            if(arr[a]!=0){
                int t = arr[a];
                arr[a] = arr[j];
                arr[j] = t;
                a++;
                j++;
            }else{
                a++;
            }
        }

        System.out.println();
        
        System.out.print("Array After : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



        sc.close();
    }
}
