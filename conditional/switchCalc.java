package conditional;
import java.util.*;
public class switchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a : ");
        int a = sc.nextInt();

        System.out.print("Enter value for b : ");
        int b = sc.nextInt();

        System.out.println("Enter a button from following: \n 1 = Sum \n 2 = Difference \n 3 = Product \n 4 = Division \n");
        int button = sc.nextInt();
        
        switch(button) {
            case 1 : System.out.print("a + b = ");
            System.out.println(a+b);
            break;
            case 2 : System.out.print("a - b = ");
            System.out.println(a-b);
            break;
            case 3 : System.out.print("a * b = ");
            System.out.println(a*b);
            break;
            case 4 : if(b == 0) {
                System.out.println("Division by 0 not possible.");
            } else {
                System.out.println("a / b = " + 1.0*a/b);
            }
            break;
            default : System.out.println("invalid button");
        }
        sc.close();
    }
}