package arrays;

public class maxsubarraysum {
    public static void maxSubArraysSumBrute(int num[]){      //TC = O(n^3)
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start=i;
            for (int j = i; j < num.length; j++) {
                int end=j;
                int currSum=0;
                for (int k = start; k <=end; k++) {
                    System.out.print(num[k]+" ");
                    currSum+=num[k];
                }
                if (currSum>maxSum) {
                    maxSum=currSum;
                }
                System.out.println();
                System.out.println("Sum of this subarray: "+currSum);
            }
            System.out.println();
        }
        System.out.println("Max sum of subarray: "+maxSum);
    }
    public static void maxSubArraysSumPrefix(int num[]){     //TC = O(n^2)
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];

        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int start=i;
            for (int j = i; j < num.length; j++) {
                int end=j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currSum>maxSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum of subarray: "+maxSum);
    }

    public static void maxSumKadane(int nums[]){            //TC = O(n)
        int mSum=nums[0];
        int cSum=0;
        for (int i = 0; i < nums.length; i++) {
            cSum+=nums[i];
            if(cSum>mSum){mSum=cSum;}
            if(cSum<0){cSum=0;}
        }
        System.out.println("Max sum of subarray: "+mSum);
    }

    public static void main(String[] args) {
        int num[] = {2,5,7,8,10};
        maxSumKadane(num);
    }
}
