// Soal2 - Soal Prioritas 1 - Menghitung luas

import java.util.Scanner;

public class Luas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Lebar: ");
        double lebar = scanner.nextDouble();

        double luas = panjang * lebar;
        if (luas % 2 == 0) {
            System.out.println("\"even rectangle\"");
        } else {
            System.out.println("\"odd rectangle\"");
        }
    }
}
