import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai n
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Bilangan prima dari 1 hingga " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean prima = true;

            // Cek apakah i adalah bilangan prima
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            // Cetak bilangan prima
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
