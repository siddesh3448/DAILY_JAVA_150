import java.util.Scanner;

public class rev_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String here: ");
        String str = sc.nextLine();

        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            reverse += ch;
        }

        System.out.println("before --> "+str);

        System.out.println("after --> "+reverse);

        sc.close();
    }
}
