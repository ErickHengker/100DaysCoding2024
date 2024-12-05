public class DAY95 {
    public static void main(String[] args) {
         int a = 5;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = i; k < a - 1; k++) {
                System.out.print(" ");
            }
            for (int m = i; m < a; m++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
