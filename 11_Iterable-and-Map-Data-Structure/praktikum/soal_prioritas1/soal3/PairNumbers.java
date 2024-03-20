import java.util.Arrays;

public class PairNumbers {
    public static int[] findPair(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        // case 1
        int[] num1 = {1, 2, 3, 4, 6};
        int target1 = 6;

        int[] num2 = {2, 5, 9, 11};
        int target2 = 11;

        int[] result1 = findPair(num1, target1);
        int[] result2 = findPair(num2, target2);

        System.out.println("Input: " + Arrays.toString(num1) + ", target=" + target1);
        System.out.println("Output: " + Arrays.toString(result1));

        System.out.println("\nInput: " + Arrays.toString(num2) + ", target=" + target2);
        System.out.println("Output: " + Arrays.toString(result2));
    }
}

