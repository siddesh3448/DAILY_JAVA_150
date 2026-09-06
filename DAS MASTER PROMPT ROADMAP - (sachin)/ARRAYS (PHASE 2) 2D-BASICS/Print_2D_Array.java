import java.util.Scanner;

public class Print_2D_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        System.out.print("Enter number of cols : ");
        int c = sc.nextInt();



        int[][] arr = new int[r][c];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter element : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(arr.length+" this is length of row of array");

        System.out.println(arr[0].length+" this is length of row of array");

        sc.close();
    }
}

