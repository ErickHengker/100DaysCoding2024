package soalday88;

import java.util.Scanner;

public class SoalDay88 {

    public static void main(String[] args) {
       Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan nama anggota : ");
        String nama = masuk.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = masuk.nextInt();
        System.out.println("Apakah anggota merupakan member? ");
        boolean status = masuk.nextBoolean();
        System.out.printf("Nama : %s%n",nama);
        System.out.printf("Umur : %d%n",umur);
        System.out.printf("Status keanggotaan : %s%n",status ? "member" : "Non-Member");
        if(umur > 18){
            System.out.println("Selamat anda memenuhi syarat untuk keanggotaan Premium");
        }else{
            System.out.println("Maaf anda tidak memenuhi syarat untuk keanggotaan premium");
        }
        }
        
    }
