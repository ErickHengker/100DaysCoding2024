
package soal3;

public class Soal3 {

    public static void main(String[] args) {
       double [] angka = {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11, 27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4, 53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768};
    double min = angka[0];
    double max = angka[0];
    double sum = 0;
        for (double angka1 : angka) {
            if (angka1 < min) {
                min = angka1;
            }
            if (angka1 > max){
                max = angka1;
            }
            sum += angka1;
        }
        double rata = sum / angka.length;
        System.out.println("Nilai terkecil : " +min);
        System.out.println("Nilai terbesar : " +max);
        System.out.println("Total : "+ sum);
        System.out.println("Rata-Rata : " +rata);
    }
    
}
