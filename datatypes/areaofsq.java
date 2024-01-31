package datatypes;

import java.util.Scanner;

public class areaofsq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int side = sc.nextInt();
        sc.close();
        int area = side*side;
        System.out.println(area);
    }    
}
