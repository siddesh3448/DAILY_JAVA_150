import java.util.Arrays;

public class Swap_Elements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        swap(arr, 0, 1);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int indx1, int indx2) {
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
    }
}
