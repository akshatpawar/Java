package arrays;

public class pairsinarray {
    public static void pairsinArray(int nums[]){      //TC = O(n^2)
        int tp=0;
        for (int i = 0; i < nums.length; i++) {
            int curr=nums[i];
            for (int j = i+1; j < nums.length; j++) {
                System.out.print("("+curr+","+nums[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+tp);
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        pairsinArray(nums);
    }
}
