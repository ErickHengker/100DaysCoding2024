package day29;

import java.math.BigInteger;
//untuk BigInteger itu menggunakan import 

public class Day29 {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("200");
        BigInteger c = new BigInteger("10");
        //aritmatka 
        BigInteger jumlah = a.add(b);
        BigInteger kurang = c.subtract(a);
        BigInteger kali = a.multiply(b);
        BigInteger bagi = c.divide(a);

        //modulus atau sisa bagi
        BigInteger mod = b.mod(c);

        System.out.println("Penjumlahan = " + jumlah);
        System.out.println("Pengurangan = " + kurang);
        System.out.println("Perkalian = " + kali);
        System.out.println("Pembagian = " + bagi);
        System.out.println("Sisa bagi = " + mod);

    }

}
