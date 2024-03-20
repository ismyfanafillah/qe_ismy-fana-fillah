import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueNumbers {
  public static List<Integer> findUniqueNumbers(String input) {
    int[] frequency = new int[10]; 

    for (char digit : input.toCharArray()) {
      frequency[digit - '0']++;
    }

    List<Integer> uniqueNumbers = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
        if (frequency[i] == 1) {
          uniqueNumbers.add(i);
        }
    }
    return uniqueNumbers;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
    
        List<Integer> output = findUniqueNumbers(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + output);
    }
}
