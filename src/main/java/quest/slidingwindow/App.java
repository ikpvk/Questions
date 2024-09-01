package quest.slidingwindow;

public class App {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        System.out.println(Solution.maxSum(arr, k));
    }
}
