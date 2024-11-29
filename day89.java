package soalday89;


public class charat {
    public static void main(String[] args) {
        int [] nilai = {85,90,78,88,92};
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai sebelum :" + ":" + nilai[i]);
        }
        nilai[3] = 89;
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai sesudah " + ":" +nilai[i]);
        }
        
    }
    
}
