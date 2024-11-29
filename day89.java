package soalday88;

public class charat {
    public static void main(String[] args) {
        int[] nilai = {85, 90, 78, 88, 92};

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai sebelum: " + nilai[i]);
        }
        nilai[3] = 89;
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai sesudah: " + nilai[i]);
        }
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double rataRata = (double) total / nilai.length;        System.out.println("Rata-rata nilai: " + rataRata);
    }
}
