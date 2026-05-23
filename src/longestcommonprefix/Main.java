package longestcommonprefix;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        String answer = strs[0];

        if (answer.isEmpty()) {
            return answer;
        }

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            if (str.isEmpty()) {
                return str;
            }

            int j = 0;
            int minLength = Math.min(answer.length(), str.length());

            while (j < minLength && answer.charAt(j) == str.charAt(j)) {
                j++;
            }
            answer = answer.substring(0, j);
        }

        return answer;
    }
}
