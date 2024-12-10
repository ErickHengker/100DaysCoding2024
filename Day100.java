
package icc;

import java.time.LocalTime;
import java.util.Scanner;

public class ICC {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String nama = masuk.nextLine();
        LocalTime waktu = LocalTime.now();
        String salam;
        if(waktu.isBefore(LocalTime.NOON)){
            salam = "Selamat Pagi";
        }else if (waktu.isBefore(LocalTime.of(17, 0))){
            salam = "Selamat Siang";
        }else {
            salam = "Selamat malam";}
        System.out.println("====================================");
        System.out.println("------------------------------------");
        System.out.println(salam + ", " + nama);
        System.out.println("Program anda telah selesai");
        System.out.println("------------------------------------");
        System.out.println("====================================");

    }
        
    }
    

