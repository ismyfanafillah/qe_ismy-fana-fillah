// Soal2 - Soal Prioritas 2 - Mengganti huruf vokal dengan angka

import java.util.Scanner;

public class Huruf {
    public static String gantiVokal(String kata) {
        String kataBaru = "";
        for (char huruf : kata.toCharArray()) {
            switch (Character.toUpperCase(huruf)) {
                case 'A':
                    kataBaru += "4";
                    break;
                case 'E':
                    kataBaru += "3";
                    break;
                case 'I':
                    kataBaru += "1";
                    break;
                case 'O':
                    kataBaru += "0";
                    break;
                default:
                    kataBaru += huruf;
            }
        }
        return kataBaru;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kata: ");
        String kata = scanner.nextLine();

        System.out.println(gantiVokal(kata));
    }
}

// cara 2 : pakai modifikasi string dengan StringBuilder
// import java.util.Scanner;

// public class Huruf {
//     public static String gantiVokal(String kata) {
//         StringBuilder kataBaru = new StringBuilder();
//         for (char huruf : kata.toCharArray()) {
//             switch (Character.toUpperCase(huruf)) {
//                 case 'A':
//                     kataBaru.append('4');
//                     break;
//                 case 'E':
//                     kataBaru.append('3');
//                     break;
//                 case 'I':
//                     kataBaru.append('1');
//                     break;
//                 case 'O':
//                     kataBaru.append('0');
//                     break;
//                 default:
//                     kataBaru.append(huruf);
//             }
//         }
//         return kataBaru.toString();
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Kata: ");
//         String kata = scanner.nextLine();

//         System.out.println(gantiVokal(kata));
//     }
// }
