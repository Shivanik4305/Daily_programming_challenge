import java.util.Arrays;

public class Sort0_1_2 {
    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        
        while (mid <= high) {
            if (arr[mid] == 0) {
                
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
      
        int[] arr1 = {0, 1, 2, 1, 0, 2, 1, 0};
        sortArray(arr1);
        System.out.println(Arrays.toString(arr1)); 

       
       
    }
}
