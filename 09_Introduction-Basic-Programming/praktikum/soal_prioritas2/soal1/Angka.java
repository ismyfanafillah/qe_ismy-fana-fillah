// Soal1 - Soal Prioritas 2 - Menampilkan sekumpulan angka habis dibagi n

import java.util.Scanner;

public class Angka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah angka: ");
        int jumlahAngka = scanner.nextInt();
        System.out.print("Nilai n: ");
        int n = scanner.nextInt();

        int count = 0;
        int i = 1;
        while (count < jumlahAngka) {
            if (i % n == 0) {
                System.out.print(i + "\n");
                count++;
            }
            i++;
        }
    }
}
