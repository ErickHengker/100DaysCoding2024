
package day32;

public class ErickSuryaPratama {

    public static void main(String[] args) {
        int angka = 10000;
        byte bait;
        
        // Widening casting (otomatis)
        double angka1 = angka;
        System.out.println(angka1);
        
        // Narrowing casting (manual)
        bait = (byte) angka;
        System.out.println(bait); // Mungkin akan menghasilkan nilai yang berbeda karena byte memiliki range yang lebih kecil
 
    }
    
}
