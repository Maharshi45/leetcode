package searchinsertposition;

public class Main {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{0, 2, 4, 6, 8}, 9));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        if (nums[l] == target) {
            return l;
        }
        if (nums[r] == target) {
            return r;
        }
        if (target < nums[l]) {
            return 0;
        }
        if (target > nums[r]) {
            return r + 1;
        }

        while (l != r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (mid == l) {
                return l + 1;
            }
            if (target > nums[mid]) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return -1;
    }
}
