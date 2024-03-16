// pakai set

// import java.util.Scanner;
// import java.util.Map;
// import java.util.HashMap;
// import java.util.ArrayList;
// import java.util.List;

// public class UniqueNumbers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Prompting the user for input
//         System.out.println("Enter a series of numbers: ");
//         String input = scanner.nextLine();
        
//         // Using a map to store the frequency of each number
//         Map<Character, Integer> frequencyMap = new HashMap<>();
        
//         // Iterating over the input to populate the frequency map
//         for (char c : input.toCharArray()) {
//             frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
//         }
        
//         // Finding numbers that appear only once and storing them in a list
//         List<Character> uniqueNumbers = new ArrayList<>();
//         for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
//             if (entry.getValue() == 1) {
//                 uniqueNumbers.add(entry.getKey());
//             }
//         }
        
//         // Outputting the result
//         if (uniqueNumbers.isEmpty()) {
//             System.out.println("Output: []");
//         } else {
//             System.out.print("Output: [");
//             for (int i = 0; i < uniqueNumbers.size(); i++) {
//                 System.out.print(uniqueNumbers.get(i));
//                 if (i < uniqueNumbers.size() - 1) {
//                     System.out.print(", ");
//                 }
//             }
//             System.out.println("]");
//         }
//     }
// }
