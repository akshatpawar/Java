package sorting;
import java.util.*;

public class bubblesort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i =0; i<=n-2; i++){
            int swap=0;
            for(int j = 0; j<=n-2-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap=1;
                }
            }
            if (swap==0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
