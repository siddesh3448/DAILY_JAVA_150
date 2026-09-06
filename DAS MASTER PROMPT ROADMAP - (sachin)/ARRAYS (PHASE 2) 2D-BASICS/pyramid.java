public class pyramid {
    public static void main(String[] args) {

        int r = 5;

        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= r - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

         int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println();

        }
    }
}
