package sorting;
import java.util.*;

public class selectionsort {
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
