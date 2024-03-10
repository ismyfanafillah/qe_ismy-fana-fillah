// Soal1 - Soal Prioritas 1 - Menghitung biaya pengiriman paket

import java.util.Scanner;

public class Biaya {
    public static int hitungBiayaBerat(double berat) {
        if (berat < 2) {
            return 10000;
        } else if (berat >= 2 && berat <= 7) {
            return 15000;
        } else if (berat >= 8 && berat <= 15) {
            return 25000;
        } else {
            return 40000;
        }
    }

    public static int hitungBiayaJarak(double jarak) {
        if (jarak < 1) {
            return 2000;
        } else if (jarak >= 1 && jarak <= 7) {
            return 5000;
        } else if (jarak >= 8 && jarak <= 15) {
            return 10000;
        } else {
            return 20000;
        }
    }

    public static int hitungTotalBiaya(double berat, double jarak) {
        int biayaBerat = hitungBiayaBerat(berat);
        int biayaJarak = hitungBiayaJarak(jarak);
        return biayaBerat + biayaJarak;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berat paket (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Jarak tempuh (km): ");
        double jarak = scanner.nextDouble();

        int totalBiaya = hitungTotalBiaya(berat, jarak);
        System.out.println("Biaya: Rp " + totalBiaya);
    }
}
