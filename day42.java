package ErickSuryaPratama;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
     Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan angka ");
        int a = masuk.nextInt();
        System.out.print("Masukkan angka ");
        int b = masuk.nextInt();
        
        //print
        System.out.println(a == b);
        System.out.println(a != b); 
    }
    
}
