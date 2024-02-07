package loops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        sc.close();
        int reversed = 0;
        while (n!=0) {
            int digit = n%10;
            reversed = reversed*10 + digit;
            n/=10;
        }
        System.out.println(reversed);
    }
}
