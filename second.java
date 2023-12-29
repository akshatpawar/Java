import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println("Baalik");
        } else {
            System.out.println("Nabalik");
        }
        sc.close();
    }
}