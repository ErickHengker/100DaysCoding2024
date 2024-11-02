package soal;
public class day62 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop berhenti di angka: " + i);
                break;
            }
            System.out.println("Angka: " + i);
        }
        System.out.println("Loop selesai.");
    }
}
