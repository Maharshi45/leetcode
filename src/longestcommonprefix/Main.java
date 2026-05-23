package longestcommonprefix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];

        if (firstStr.isEmpty()) {
            return "";
        }

        int j = 0;
        int minLength = Math.min(firstStr.length(), lastStr.length());

        while (j < minLength && firstStr.charAt(j) == lastStr.charAt(j)) {
            j++;
        }

        return firstStr.substring(0, j);
    }
}
