package ErickSuryaPratama;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int angka = masuk.nextInt();
        
        if (angka >= 100) {
            System.out.println("ratusan");
        } else if (angka >= 10){
            System.out.println("puluhan");
        } else if (angka <= 0){
            System.out.println("netral-mines");
        } else {
            System.out.println("tes");
        }
     
     
    }
        
    }

