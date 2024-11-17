package pp;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Input kata :");
        String nama = a.nextLine();
        System.out.print("Perbandingan :");
        String nama1 = a.nextLine();
        
        System.out.println("Hasil : "+ nama1.equals(nama));
        System.out.println("Hasil tanpa pandang" +nama.equalsIgnoreCase(nama1));
    }
}
