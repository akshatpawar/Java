package functions;

public class DecToBin {
    public static void decToBin(int n){
        int pow = 0;
        int bin = 0;
        int last_digit;
        while (n!=0) {
            last_digit = n % 2;
            n=n/2;
            bin=bin+ last_digit * (int)Math.pow(10, pow);
            pow++;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        decToBin(21);
    }
}
