import java.util.Scanner;

public class space_counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String here: ");
        String space = sc.nextLine();

        int count = 0;

        for(int i=0;i<space.length();i++){
            if(space.isBlank()){
                count++;
            }else{
                continue;
            }
        }
        System.out.print(count);
    }
}
