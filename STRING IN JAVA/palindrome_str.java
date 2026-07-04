import java.util.Scanner;

public class palindrome_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String here: ");
        String str = sc.nextLine();

        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            rev += ch;
        }

        if(rev.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrom");
        } 

        sc.close();
    }
}
