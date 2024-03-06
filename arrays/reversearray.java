package arrays;

public class reversearray {
    public static void revArray(int nums[]){
        int start=0, end=nums.length-1;
        while (start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        revArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
