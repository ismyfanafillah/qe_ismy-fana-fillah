import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MergeArrays {

    // Method to clean a string from unwanted characters
    public static String cleanInput(String input) {
        // Clean characters such as punctuation and symbols, except for spaces
        return input.replaceAll("[^\\w\\s]", "");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input Array 1 : ");
        String[] array1 = cleanInput(scanner.nextLine()).split("\\s+");
        System.out.printf("Input Array 2 : ");
        String[] array2 = cleanInput(scanner.nextLine()).split("\\s+");

        // LinkedHashSet for maintaining the order of the elements
        Set<String> set = new LinkedHashSet<>(Arrays.asList(array1));
        set.addAll(Arrays.asList(array2));

        // Change the set to an ArrayList
        ArrayList<String> result = new ArrayList<>(set);

        // Display the result
        System.out.println("Output : [" + String.join(", ", result) + "]");
    }
}
