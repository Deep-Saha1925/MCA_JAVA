class Palindrome {

    boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }
}

public class P14 {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        int n = Integer.parseInt(args[0]);

        if (obj.isPalindrome(n)) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is NOT a Palindrome");
        }
    }
}