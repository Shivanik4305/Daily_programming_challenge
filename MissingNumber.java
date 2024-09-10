public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of the first n natural numbers
        int totalSum = n * (n + 1) / 2;
        
        // Calculate the sum of the elements in the array
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        
        // The missing number is the difference between totalSum and arrSum
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 2, 4, 5};
        int n1 = 5;
        System.out.println("Missing number: " + findMissingNumber(arr1, n1)); // Output: 3

        // Test case 2
        int[] arr2 = {2, 3, 4, 5};
        int n2 = 5;
        System.out.println("Missing number: " + findMissingNumber(arr2, n2)); // Output: 1

        // Test case 3
        int[] arr3 = {1, 2, 3, 4};
        int n3 = 5;
        System.out.println("Missing number: " + findMissingNumber(arr3, n3)); // Output: 5

        // Test case 4
        int[] arr4 = {1};
        int n4 = 2;
        System.out.println("Missing number: " + findMissingNumber(arr4, n4)); // Output: 2

        // Test case 5
        int n5 = 1000000;
        int[] arr5 = new int[n5 - 1];
        for (int i = 1; i < n5; i++) {
            arr5[i - 1] = i;
        }
        System.out.println("Missing number: " + findMissingNumber(arr5, n5)); // Output: 1000000
    }
}
