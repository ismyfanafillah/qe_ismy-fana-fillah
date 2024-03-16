public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 3, 6, 9, 9};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int nextNonDuplicate = 1; // index of the next non-duplicate element
        for (int i = 1; i < nums.length; i++) {
            if (nums[nextNonDuplicate - 1] != nums[i]) {
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }
}
