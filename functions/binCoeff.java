package functions;

public class binCoeff {
    public static int factorial(int n){
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoeff(int n, int m){
        int fact_n = factorial(n);
        int fact_m = factorial(m);
        int fact_n_m = factorial(n-m);
        int binCoeff= fact_n / (fact_m * fact_n_m);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binomialCoeff(5, 2));
    }
}