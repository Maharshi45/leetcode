package romantointeger;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int length = s.length();

        int sum = getValue(s.charAt(length - 1));

        int lastValue = sum;

        for (int i = length - 2; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));
            if (currentValue >= lastValue) {
                sum += currentValue;
            } else {
                sum -= currentValue;
            }
            lastValue = currentValue;
        }

        return sum;
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
