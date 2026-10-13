public class Largest_Element {
    static int Max(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else {
                continue;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 23, 9, 18 };

        System.out.println(Max(arr));
    }
}
