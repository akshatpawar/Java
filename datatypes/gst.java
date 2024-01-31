package datatypes;

import java.util.Scanner;

public class gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Total amount of items: " + total);
        float gst = total * 18 / 100;
        System.out.println("Total amount with 18% gst: " + (total + gst));
        sc.close();
    }
}
