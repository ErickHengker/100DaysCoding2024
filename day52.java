package ErickSuryaPratama;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int harga = masuk.nextInt();
        int mahal = 100;
        String total = harga >= mahal?"Mahal":"Tidak mahal";
        System.out.println("keterangan : " +total);
    }
        
    }

