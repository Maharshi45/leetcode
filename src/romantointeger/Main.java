package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>(7);

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;

        int i = 0;

        for (; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((c == 'I' || c == 'X' || c == 'C') && i != s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                switch (c) {
                    case 'I':
                        if (nextChar == 'V') {
                            sum += 4;
                            i++;
                        } else if (nextChar == 'X') {
                            sum += 9;
                            i++;
                        } else {
                            sum += romanMap.get(s.charAt(i));
                        }
                        break;
                    case 'X':
                        if (nextChar == 'L') {
                            sum += 40;
                            i++;
                        } else if (nextChar == 'C') {
                            sum += 90;
                            i++;
                        } else {
                            sum += romanMap.get(s.charAt(i));
                        }
                        break;
                    case 'C':
                        if (nextChar == 'D') {
                            sum += 400;
                            i++;
                        } else if (nextChar == 'M') {
                            sum += 900;
                            i++;
                        } else {
                            sum += romanMap.get(s.charAt(i));
                        }
                        break;
                }
            } else {
                sum += romanMap.get(s.charAt(i));
            }
        }

        return sum;
    }
}
