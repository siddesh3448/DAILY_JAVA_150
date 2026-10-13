import java.util.Scanner;
import java.util.Arrays;

public class Strings_in_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = in.nextInt();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + ". Name :==> ");
            names[i] = in.next();
        }

        System.out.print("Final Array :==> ");
        System.out.println(Arrays.toString(names));

        for (String string : names) {
            System.out.println(string);
        }

        in.close();
    }
}
