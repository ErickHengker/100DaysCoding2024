import java.util.Scanner;
public class Day93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinggi = sc.nextInt();
        
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {
                if (j == i || j == (10 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
