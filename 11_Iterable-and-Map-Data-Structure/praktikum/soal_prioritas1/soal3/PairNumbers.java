// import java.util.Arrays;

// public class PairNumbers {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3, 4, 6};
//         int target = 6;
//         int[] result = findPair(numbers, target);
//         System.out.println(Arrays.toString(result));
//     }

//     public static int[] findPair(int[] arr, int targetSum) {
//         int left = 0, right = arr.length - 1;
//         while (left < right) {
//             int currentSum = arr[left] + arr[right];
//             if (currentSum == targetSum) {
//                 return new int[] {left, right}; // Found the pair
//             }

//             if (currentSum < targetSum) {
//                 left++; // We need a pair with a bigger sum
//             } else {
//                 right--; // We need a pair with a smaller sum
//             }
//         }
//         return new int[] {-1, -1}; // Pair not found
//     }
// }
