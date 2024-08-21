package sorting;
import java.util.Arrays;

public class countsort {
    public static void countingSort(int[] arr){
        int largest= Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<=largest; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        countingSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
