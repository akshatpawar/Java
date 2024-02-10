//program that reads a set of integers, and then prints the sum of the even and odd integers
package loops;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        do{
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if (n%2==0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
            System.out.println("Do you want to continue? 1 for yes, 0 for no");
            choice = sc.nextInt();
        } while(choice==1);
        
        System.out.println("The sum of even numbers is " + evenSum);
        System.out.println("The sum of odd numbers is " + oddSum);
        sc.close();
    }
}
