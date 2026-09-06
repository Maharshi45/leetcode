package palindromenumber;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int copy = x;
        while (copy > 0) {
            reverse = (reverse * 10) + copy % 10;
            copy = copy / 10;
        }
        return x == reverse;
    }
}
