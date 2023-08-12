public class knap_sack {
    public static void main(String[] args) {
        int[] profit = {0, 16, 25, 60};
        int[] weight = {0, 2, 4, 8};
        int n = profit.length;
        int capacity = 12;
        int[][] result = new int[n][capacity + 1];

        for (int i = 0; i <= capacity; i++) {
            result[0][i] = 0;
        }
        for (int i = 0; i < n; i++) {
            result[i][0] = 0;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weight[i] > j) {
                    result[i][j] = result[i - 1][j];
                } else {
                    result[i][j] = Math.max(profit[i] + result[i - 1][j - weight[i]], result[i - 1][j]);
                }
            }
        }

        System.out.println("Result: " + result[n - 1][capacity]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

    }
}