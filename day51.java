package javaapplication58;

import java.util.Scanner;

public class commit {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("choose your character : ");
        String a = masuk.nextLine();
        switch (a) {
            case "L":
                System.out.println("Laki laki");
                break;
            case "P":
                System.out.println("Perempuan");
                break;
            default:
                System.out.println("None");
        }
    }
}
