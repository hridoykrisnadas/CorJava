import java.util.*;
public class MaxSubArray {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        int s_max = Integer.MIN_VALUE, st_index = 0, en_index = 0;
        int[] a = new int[n];
        System.out.println("Enter array values: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + a[j];
                if (sum > s_max) {
                    s_max = sum;
                    st_index = i;
                    en_index = j;
                }
            }
        }
        System.out.println("Maximum subarray value: " + s_max);
        System.out.println("Maximum subarray Starting Index: " + st_index);
        System.out.println("Maximum subarray Ending Index: " + en_index);
    }
}
