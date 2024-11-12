
package ISC;

public class ErickSuryaPratama {
    public static int faktorial(int n) {
        if (n <= 1) { 
            return 1;
        } else {
            return n * faktorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        int angka = 5;
        int hasil = faktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }
        
    }
 

