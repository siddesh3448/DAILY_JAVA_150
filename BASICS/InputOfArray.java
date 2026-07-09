import java.util.*;

public class InputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        int[] arry = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1)+": ");
            arry[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arry.length; i++) {
            if(arry[i]!=x && arry[i]>x){
                count++;
                System.out.print(arry[i]+" ");
            }
        }
        System.out.println();
        System.out.println(count);

    }
}