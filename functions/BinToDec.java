package functions;

public class BinToDec {
    public static int binToDec(int n){
        int dec = 0;
        int pow = 0;
        while (n!=0) {
            int last_digit = n % 10;
            n = n / 10;
            dec += last_digit * (int)Math.pow(2, pow);
            pow++;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(binToDec(10101));
    }
}
