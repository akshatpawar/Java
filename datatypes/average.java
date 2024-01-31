package datatypes;
import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A: ");
        float a = sc.nextFloat();
        System.out.println("Enter number B: ");
        float b = sc.nextFloat();
        System.out.println("Enter number C: ");
        float c = sc.nextFloat();
        float avg = (float)(a+b+c)/3;
        System.out.println(avg);
        sc.close();
    }
}
