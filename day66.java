
import java.util.Scanner;


public class Day67 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        //persegi
        System.out.print("Masukkan tinggi : ");
        int tinggi = masuk.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = masuk.nextInt();
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < tinggi; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
        //persegi panjang
         System.out.print("masukkan tinggi : ");
         int tinggi1 = masuk.nextInt();
         System.out.print("Masukkan Lebar : ");
         int lebar1 = masuk.nextInt();
         for (int i = 0; i < tinggi1; i++) {
             for (int j = 0; j < lebar1; j++) {
                 System.out.print("*");
                 
             }
             System.out.println(" ");
        }
    }
}
