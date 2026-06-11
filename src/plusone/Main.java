package plusone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{8, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        for (; index >= 0; index--) {
            int num = digits[index];
            if (num == 9) {
                digits[index] = 0;
            } else {
                digits[index] = num + 1;
                break;
            }
        }
        if (index == -1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
