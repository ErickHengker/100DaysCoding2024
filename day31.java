package ErickSuryaPratama;

public class Main {
    
    public static void main(String[] args) {
        String ang = "100";
        //konversi ke tipe data primitif
        long a = Long.parseLong(ang);
        short b = Short.parseShort(ang);
        int c = Integer.parseInt(ang);
        byte d = Byte.parseByte(ang);
        
        //print
        System.out.println("Hasil a "+a);
        System.out.println("Hasil b "+b);
        System.out.println("Hasil c "+c);
        System.out.println("Hssil d "+d);
    }
    
}
