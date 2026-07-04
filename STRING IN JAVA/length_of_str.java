import java.util.Scanner;

public class length_of_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you String here: ");
        String input = sc.nextLine();

        char[] crr = input.toCharArray();
        int len = crr.length;

        System.out.println(len);
        sc.close();
    }
}
