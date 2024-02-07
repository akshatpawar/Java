package loops;

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        if (num==2) {
            System.out.println("Prime");
        } else {
            for (int i=2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime==true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
