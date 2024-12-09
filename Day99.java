import java.util.Scanner;
public class Day99 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("          Kalkulator Sederhana          ");
        boolean cek = true;
        while(lanjut){
            System.out.println("========================================");
            System.out.print("Masukkan nilai pertama\t: ");
            double n1 = in.nextDouble();
            System.out.print("Masukkan nilai kedua\t: ");
            double n2 = in.nextDouble(); 
            System.out.print("pilih operator(+, -, *, /) atau 'q' untuk keluar : ");
            char operator = in.next().charAt(0);
            if(operator == 'q' || operator == 'Q'){
                System.out.println("Terima kasih telah menggunakan kalkulator!");
                cek = false;
                continue;
            }
           
            double hasil = 0;
            switch(operator){
                case '+':
                    hasil = n1 + n2;
                    System.out.println("Hasil = " + hasil);
                    break;
                case '-':
                    hasil = n1 - n2;
                    System.out.println("Hasil = " + hasil);
                    break;
                case '*':
                    hasil = n1 * n2;
                    System.out.println("Hasil = " + hasil);
                    break;
                case '/':
                    if(n2 != 0){
                        hasil = n1 / n2;
                        System.out.println("Hasil = " + hasil);
                    }else{
                        System.out.println("Error : Tidak bisa membagi dengan nol!");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }         
        }
    }
}
