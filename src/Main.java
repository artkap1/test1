import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {14, 3, 4, 2, 10, 100, 234, 123, 2, 6, 8, 7};

        System.out.println(Arrays.toString(numbers));
        quickSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void quickSort(int[] arr){
        int pivot = arr.length / 2;
        int low = 0;
        int high = arr.length - 1;

        helper(arr, pivot, low, high);
    }

    public static void swap(int[] arr, int pivot, int low, int high){
        if (low > pivot || high < pivot){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
    }

    public static void helper(int[] arr, int pivot, int low, int high){
        if (high != 0 || low != arr.length - 1){
            while (low < pivot && high > pivot){
                swap(arr, pivot, low, high);

                low++;
                high--;
            }

            helper(arr, pivot / 2, 0, pivot);
            helper(arr, pivot, pivot, arr.length);
        }
    }
}