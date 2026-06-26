package mergesortedarray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int p = nums1.length - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[p--] = nums2[j--];
            } else {
                nums1[p--] = nums1[i--];
            }
        }

        while (j >= 0) {
            nums1[p--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
