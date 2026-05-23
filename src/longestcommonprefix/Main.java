package longestcommonprefix;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
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

            if (answer.length() > str.length()) {
                answer = answer.substring(0, str.length());
            }

            while (!str.startsWith(answer)) {
                answer = answer.substring(0, answer.length() - 1);
                if (answer.isEmpty()) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
