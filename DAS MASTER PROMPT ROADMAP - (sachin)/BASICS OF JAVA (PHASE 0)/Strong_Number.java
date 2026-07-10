import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int og = num ;

        int sum = 0;
        
        while(num!=0){
            int ld = num%10;
            int facto = 1;

            for(int i=ld;i>0;i--){
                facto *= i;
            }
            sum += facto;
            num /= 10;
        }

        if(sum == og) System.out.println("Strong Number");
        else System.out.println("Not A Strong Number");
        sc.close();
    }
}
