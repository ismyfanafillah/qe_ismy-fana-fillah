// Soal1 - Soal Eksplorasi - Mengubah kata menjadi Camel Case

import java.util.Scanner;

public class CamelCase {
    public static String camelCase(String kata) {
        String[] words = kata.split("\\s+");
        String camelCase = words[0].toLowerCase();
        for (int i = 1; i < words.length; i++) {
            camelCase += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return camelCase;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kata: ");
        String kata = scanner.nextLine();

        System.out.println(camelCase(kata));
    }
}

//cara 2 : pakai modifikasi string dengan StringBuilder
// import java.util.Scanner;
// public class CamelCase {
//     public static String camelCase(String kata) {
//         String[] words = kata.split("\\s+");
//         StringBuilder camelCase = new StringBuilder(words[0].toLowerCase());
//         for (int i = 1; i < words.length; i++) {
//             camelCase.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
//         }
//         return camelCase.toString();
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Kata: ");
//         String kata = scanner.nextLine();

//         System.out.println(camelCase(kata));
//     }
// }
