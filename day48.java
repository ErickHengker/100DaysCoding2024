package ErickSuryaPratama;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int angka = masuk.nextInt();
        
        if (angka >= 10) {
            System.out.println("10 keatas");
        } else{
            System.out.println("angka mines");
        }
     
     
    }
        
    }

