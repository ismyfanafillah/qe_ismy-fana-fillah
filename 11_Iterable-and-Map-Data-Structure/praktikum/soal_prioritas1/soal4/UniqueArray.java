import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};
        System.out.println(Arrays.toString(findUnique(array1, array2)));
    }

    public static Integer[] findUnique(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array2) {
            set.add(num);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : array1) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }
        
        return result.toArray(new Integer[0]);
    }
}
