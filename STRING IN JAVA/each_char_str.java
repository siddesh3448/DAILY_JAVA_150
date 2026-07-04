import java.util.Scanner;

public class each_char_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String here: ");
        String input = sc.nextLine();

        char[] crr = input.toCharArray();
        
        for(char ch: crr){
            System.out.println(ch+"");
        }
        sc.close();
    }
}
