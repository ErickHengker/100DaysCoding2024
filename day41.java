package evaluasi;

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Evaluasi {

    public static void main(String[] args) {
        //day28
        Scanner scanner = new Scanner(System.in);
        // Nilai yang ingin dibandingkan
        System.out.print("Masukkan angka :");
        int nilai1 = scanner.nextInt();
        System.out.print("Masukkan angka :");
        int nilai2 = scanner.nextInt();

        boolean lebih = nilai1 > nilai2;

        // Menampilkan hasil
        System.out.print("Nilai " + nilai1 + " > " + nilai2 + " : " + lebih);

        //day29     
        System.out.print("Masukkan nilai a: ");
        BigInteger a = new BigInteger(scanner.nextLine());

        System.out.print("Masukkan nilai b: ");
        BigInteger b = new BigInteger(scanner.nextLine());

        System.out.print("Masukkan nilai c: ");
        BigInteger c = new BigInteger(scanner.nextLine());

        // Operasi aritmatika
        BigInteger jumlah = a.add(b);
        BigInteger kurang = c.subtract(a);
        BigInteger kali = a.multiply(b);
        BigInteger bagi = c.divide(a);
        BigInteger mod = b.mod(c);

        // Menampilkan hasil
        System.out.println("Penjumlahan = " + jumlah);
        System.out.println("Pengurangan = " + kurang);
        System.out.println("Perkalian = " + kali);
        System.out.println("Pembagian = " + bagi);
        System.out.println("Sisa bagi = " + mod);

        //day30
        BigDecimal angka = new BigDecimal(scanner.nextLine());
        System.out.println("Nilai dari big decimal " + angka);

        //day31
        System.out.print("Masukkan angka: ");
        String ang = scanner.nextLine();

        // Konversi ke tipe data primitif
        long ab = Long.parseLong(ang);
        short bc = Short.parseShort(ang);
        int cd = Integer.parseInt(ang);
        byte de = Byte.parseByte(ang);

        // Print hasil
        System.out.println("Hasil a (long) : " + ab);
        System.out.println("Hasil b (short) : " + bc);
        System.out.println("Hasil c (int) : " + cd);
        System.out.println("Hasil d (byte) : " + de);

        //day32
        System.out.print("Masukkan angka (int): ");
        int angka4 = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan angka (long): ");
        long angka1 = Long.parseLong(scanner.nextLine());

        // Konversi ke String
        String intStr = String.valueOf(angka4);
        String longStr = String.valueOf(angka1);

        // Menampilkan hasil konversi
        System.out.println("int to String: " + intStr);
        System.out.println("long to String: " + longStr);

        //day33
        System.out.print("Masukkan angka (int): ");
        int angka2 = Integer.parseInt(scanner.nextLine());
        byte bait;

        // Widening casting (otomatis)
        double angka3 = angka2;
        System.out.println("Widening casting (int ke double): " + angka3);

        // Narrowing casting (manual)
        bait = (byte) angka2;
        System.out.println("Narrowing casting (int ke byte): " + bait);

        //day34
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        System.out.println("Halo, " + nama + ". Usia Anda adalah " + usia + " tahun.");

        //day35
        System.out.print("Masukkan angka pertama: ");
        int angka6 = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan angka kedua: ");
        int angka7 = Integer.parseInt(scanner.nextLine());

        // Penjumlahan
        int angka8 = angka7 + angka6;
        System.out.println("Hasil penjumlahan (cara 1): " + angka7);
        System.out.println("Hasil penjumlahan (cara 2): " + (angka8 + angka6));

        // Pengurangan
        int angka9 = angka7 - angka6;
        System.out.println("Hasil pengurangan (cara 1): " + angka9);
        System.out.println("Hasil pengurangan (cara 2): " + (angka6 - angka7));

        //day36
        System.out.print("Masukkan angka pertama: ");
        int angka11 = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan angka kedua: ");
        int angka12 = Integer.parseInt(scanner.nextLine());

        // Perkalian
        int angka13 = angka11 * angka12;
        System.out.println("Hasil perkalian (cara 1): " + angka13);
        System.out.println("Hasil perkalian (cara 2): " + (angka11 * angka12));

        // Pembagian
        int angka14 = angka11 / angka12;
        System.out.println("Hasil pembagian (cara 1): " + angka14);
        System.out.println("Hasil pembagian (cara 2): " + (angka11 / angka12));

        // Modulo
        int angka15 = 10;
        int angka16 = 3;
        int angka17 = angka15 % angka16;
        System.out.println("Hasil modulo: " + angka17);

        //day37
        System.out.print("Masukkan nilai awal: ");
        int nilai = Integer.parseInt(scanner.nextLine());
        System.out.println("Nilai awal: " + nilai);

        // Penambahan
        nilai += 3;
        System.out.println("Setelah penambahan 3: " + nilai);

        // Pengurangan
        nilai -= 2;
        System.out.println("Setelah pengurangan 2: " + nilai);

        //day38
        System.out.print("Masukkan nilai awal: ");
        int nilai12 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nilai awal: " + nilai12);

        // Perkalian
        nilai12 *= 3;
        System.out.println("Setelah perkalian dengan 3: " + nilai12);

        // Pembagian
        nilai12 /= 2;
        System.out.println("Setelah pembagian dengan 2: " + nilai12);

        //day39
        System.out.println("Masukkan angka : ");
        int kol = scanner.nextInt();
        System.out.println("Masukkan angka : ");
        int angka = scanner.nextInt();
        kol %= angka;
        System.out.println("Sisa bagi : " + kol);

        //day40
        System.out.print("Masukkan nilai a: ");
        int am = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan nilai b: ");
        int be = Integer.parseInt(scanner.nextLine());

        // Melakukan perbandingan
        System.out.println("a > b: " + (am > be));
        System.out.println("a < b: " + (am < be));
        System.out.println("b < a: " + (be < am));
        System.out.println("b > a: " + (be > am));

    }

}
