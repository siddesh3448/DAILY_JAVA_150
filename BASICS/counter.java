import java.util.*;

public class counter {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int number = in.nextInt();

    System.out.print("Enter Number that you Want to count : ");
    int num = in.nextInt();

    int count = 0;

    while(number>0){
      int ld = number%10;

      if(num==ld) count++;

      number/=10;
    }

    System.out.print(num+" repets : "+count);
    in.close();
  }
}