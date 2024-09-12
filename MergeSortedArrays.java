import java.util.Arrays;

public class MergeSortedArrays {

    // Function to merge and split arrays
    public static int[][] day4(int[] arr1, int[] arr2) {
        // Combine arr1 and arr2
        int[] combined = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, combined, 0, arr1.length);
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);

        // Sort the combined array
        Arrays.sort(combined);

        // Split the sorted array into two parts
        int[] sortedArr1 = Arrays.copyOfRange(combined, 0, arr1.length);
        int[] sortedArr2 = Arrays.copyOfRange(combined, arr1.length, combined.length);

        return new int[][]{sortedArr1, sortedArr2};
    }

    // Main function to test the day4 function
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[][] result = day4(arr1, arr2);
        
        System.out.println("arr1 = " + Arrays.toString(result[0]));
        System.out.println("arr2 = " + Arrays.toString(result[1]));
    }
}
