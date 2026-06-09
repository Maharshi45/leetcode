package removeduplicatesfromsortedarray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;

        if (len == 1) {
            return len;
        }

        int r = 1;

        for (int m = 1; m < len; m++) {
            if (nums[m - 1] != nums[m]) {
                nums[r] = nums[m];
                r++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return r;
    }
}
