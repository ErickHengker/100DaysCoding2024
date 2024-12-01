
package soal;

import java.util.Scanner;

public class SOAL {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = masuk.nextLine();
        System.out.print("masukkan nama : ");
        String nama2 = masuk.nextLine();
        System.out.print("Masukkan angka : ");
        int angka = masuk.nextInt();
        String hasil;
        if(angka == 0){
            hasil = nama + " and " + nama2 + " Belum memulai apa apa, tidak ada ending";
        }else if (angka % 2 == 0){
            hasil = nama + " and " + nama2 + " will walk together";
        }else{
             hasil = nama + " and " + nama2 + " Mengambil jalan yang berbeda.";
        }
          System.out.println("\n--- Hasil Cerita ---");
        System.out.println(hasil);
    }
    
}
