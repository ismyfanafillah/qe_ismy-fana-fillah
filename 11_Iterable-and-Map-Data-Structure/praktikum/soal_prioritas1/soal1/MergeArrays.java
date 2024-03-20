import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeArrays {
    public static void main(String[] args) {
        // case 1
        String[] arr1 = {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "feng"};
        String[] mergedArr = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArr));

        // case 2
        String[] arr3 = {"lee", "jin"};
        String[] arr4 = {"kazuya", "panda"};
        String[] mergedArr2 = mergeArrays(arr3, arr4);
        System.out.println(Arrays.toString(mergedArr2));
    }

    public static String[] mergeArrays(String[] array1, String[] array2) {
        Set<String> set = new LinkedHashSet<>(); 
        set.addAll(Arrays.asList(array1));
        set.addAll(Arrays.asList(array2));
        return set.toArray(new String[0]);
    }
}
