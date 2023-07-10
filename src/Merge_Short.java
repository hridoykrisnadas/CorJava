import java.util.*;

public class Merge_Short {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Array Size: ");
        int n = s.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        divide(array, 0, n - 1);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        sort(arr, si, mid, ei);
    }

    private static void sort(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }
        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
