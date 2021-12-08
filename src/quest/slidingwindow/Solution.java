package quest.slidingwindow;

public class Solution {
    public static int maxSum(int[] arr, int k) {
        if(null==arr || arr.length==0 || k>arr.length) {
            return 0;
        }
        int maxSum = 0;
        int currentSum = 0;
        for(int i=0; i<k ; i++) {
            currentSum+=arr[i];
        }
        System.out.println("curr sum" + currentSum);
        for(int i=k; i<arr.length; i++) {
            currentSum = currentSum + arr[i] - arr[i-k];
            System.out.println("\ncurr sum" + currentSum);
            maxSum = Math.max(currentSum, maxSum);
            System.out.println("max sum" + maxSum);

        }
        return maxSum;
    }
}
