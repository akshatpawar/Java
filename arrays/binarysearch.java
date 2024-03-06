package arrays;

public class binarysearch {
    public static int binarySearch(int nums[], int key){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==key) {
                return mid;
            } else if (nums[mid]<key) {
                start=mid+1;
            } else {
                end=mid-1;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10,11};
        int key = 11;
        int result = binarySearch(nums, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: "+result);
        }
    }
}
