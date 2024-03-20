public class MaxSum {
    public static int findMaxSubSum(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }
  
        int maxSum = 0;
        int subArraySum = 0;
  
        for (int i = 0; i < k; i++) {
            subArraySum += arr[i];
        }
  
        maxSum = subArraySum;
  
        for (int i = k; i < arr.length; i++) {
            subArraySum = subArraySum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, subArraySum);
        }
  
        return maxSum;
    }
  
    public static void main(String[] args) {
        // case
        int[] num1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
  
        int[] num2 = {2, 3, 4, 1, 5};
        int k2 = 2;
  
        int result1 = findMaxSubSum(num1, k1);
        int result2 = findMaxSubSum(num2, k2);
  
        System.out.println("Input: [2, 1, 5, 1, 3, 2], k=3");
        System.out.println("Output: " + result1 + "\n");
  
        System.out.println("Input: [2, 3, 4, 1, 5], k=2");
        System.out.println("Output: " + result2);
    }
  }
  
  