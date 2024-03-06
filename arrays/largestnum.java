package arrays;
// import java.util.*;

public class largestnum {
    public static int largestNum(int nums[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                max=nums[i];
            }

            if (nums[i]<min) {
                min=nums[i];
            }
        }
        System.out.println("Smallest number is: "+min);
        
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {3,6,2,8,10,13,7,9,11};
        int result = largestNum(nums);
        System.out.println("Largest number is: "+result);
    }
}
