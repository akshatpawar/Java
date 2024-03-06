package arrays;

public class linearsearch {
    public static int linearsSearch(int nums[], int key){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        int result = linearsSearch(nums, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: "+result);
        }
    }
}
