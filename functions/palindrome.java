package functions;

public class palindrome {
    public static void isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while (n!=0) {
            int last_digit = n % 10;
            n = n / 10;
            rev = rev * 10 + last_digit;
        }
        if (temp == rev) {
            System.out.println("Yes, "+temp+ " is a palindrome number.");
        } else {
            System.out.println("No, "+temp+ " is not a palindrome number.");
        }
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
