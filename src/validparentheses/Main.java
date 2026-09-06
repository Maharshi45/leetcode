package validparentheses;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }

    public static boolean isValid(String s) {
        int length = s.length();

        if (length % 2 == 1) {
            return false;
        }

        char[] stack = new char[length / 2];

        int pointer = -1;

        char c1 = s.charAt(0);

        if (c1 == ')' || c1 == '}' || c1 == ']') {
            return false;
        }

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            try {
                if (c == ')') {
                    if (stack[pointer] != '(') {
                        return false;
                    }
                    pointer--;
                } else if (c == '}') {
                    if (stack[pointer] != '{') {
                        return false;
                    }
                    pointer--;
                } else if (c == ']') {
                    if (stack[pointer] != '[') {
                        return false;
                    }
                    pointer--;
                } else {

                    stack[++pointer] = c;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
        }

        return pointer == -1;
    }
}
