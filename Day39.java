
package day39;
import java.util.Scanner;
public class Day39 {

    public static void main(String[] args) {
       Scanner masuk = new Scanner (System.in);
        System.out.println("Masukkan angka : ");
        int kol = masuk.nextInt();
        System.out.println("Masukkan angka : ");
        int angka = masuk.nextInt();
        kol %= angka;
        System.out.println("Sisa bagi : " + kol);
    }
    
}
