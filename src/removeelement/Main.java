package removeelement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {

        int r = 0;

        for (int m = 0; m < nums.length; m++) {
            if (nums[m] != val) {
                nums[r] = nums[m];
                r++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return r;
    }
}
