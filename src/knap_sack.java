public class knap_sack {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] profit = {50, 60, 70};
        int capacity = 50;
        int n = profit.length;
        int a = knapSack(capacity, weight, profit, n);
        System.out.println("Result: " + a);
    }
    public static int knapSack(int capacity, int[] weight, int[] profit, int n) {
        if (capacity == 0 || n == 0) {
            return 0;
        }
        if (weight[n - 1] > capacity) {
            return knapSack(capacity, weight, profit, n - 1);
        } else {
            return max(
                    profit[n - 1] + knapSack(capacity - weight[n - 1], weight, profit, n - 1),
                    knapSack(capacity, weight, profit, n - 1)
            );
        }
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
}