package arrays;

public class subarrays {
    public static void subArrays(int num[]){
        int ts=0;
        for (int i = 0; i < num.length; i++) {
            int start=i;
            for (int j = i; j < num.length; j++) {
                int end=j;
                int sum=0;
                for (int k = start; k <=end; k++) {
                    System.out.print(num[k]+" ");
                    sum+=num[k];
                }
                ts++;
                System.out.println();
                System.out.println("Sum of this subarray: "+sum);
            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+ts);
    }

    public static void main(String[] args) {
        int num[] = {2,5,7,8,10};
        subArrays(num);
    }
}
