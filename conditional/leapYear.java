package conditional;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }
                else {
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}