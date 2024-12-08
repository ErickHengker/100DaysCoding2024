
import java.util.Scanner;

public class Day98 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("masukan nilai x :");
        int a = ab.nextInt();
        System.out.println("masukan nilai y :");
        int b = ab.nextInt();
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                c += i;
            }
        }
        System.out.println("hasil :" + c);
    }
}
