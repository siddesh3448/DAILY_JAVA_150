import java.util.Scanner;

public class Add_N_Numbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Nth Term: ");
        int N = input.nextInt();
        System.out.println();
        int sum = 0;

        for(int i=0;i<N;i++){
            System.out.print("Enter "+(i+1)+" number: ");
            int news = input.nextInt();
            sum += news;
        }
        System.out.print("Sum of Nth term = "+sum);
        
        input.close();
    }
}  