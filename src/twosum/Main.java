package twosum;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(ints[0] + " " + ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if (map.containsKey(secondNumber)) {
                return new int[]{i, map.get(secondNumber)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
