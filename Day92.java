public class DAY92 {
    public static void main(String[] args) {
    
        int tinggi = 5; 
        
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < 2 * tinggi - 1; j++) {
                
                if (j == i || j == (2 * tinggi - 2 - i)) {
                    
                    if (i == tinggi - 1 && j == i) {
                        System.out.print("*");
                        break;
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
