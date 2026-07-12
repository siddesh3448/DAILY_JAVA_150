public class Reverse_Array {
    public static void main(String[] args) {

        int[] arr = { 50, 40, 30, 20, 10 };

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
        }

     

        System.out.println();

        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
