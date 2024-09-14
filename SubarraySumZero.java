import java.util.*;

public class SubarraySumZero {
    public static List<int[]> findSubarraysWithZeroSum(int[] arr) {
        List<int[]> result = new ArrayList<>();
        // HashMap to store the prefix sum and the indices at which it occurs
        Map<Integer, List<Integer>> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        
        // Add a special case for subarrays starting from index 0
        prefixSumMap.put(0, new ArrayList<>());
        prefixSumMap.get(0).add(-1);  // To handle the case when the subarray starts from index 0

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // If prefixSum has been seen before, it means there are subarrays that sum to zero
            if (prefixSumMap.containsKey(prefixSum)) {
                // Get the list of indices where this prefix sum occurred previously
                List<Integer> indices = prefixSumMap.get(prefixSum);
                for (int startIndex : indices) {
                    result.add(new int[] { startIndex + 1, i });
                }
            }

            // Add the current index to the list of indices for this prefix sum
            prefixSumMap.putIfAbsent(prefixSum, new ArrayList<>());
            prefixSumMap.get(prefixSum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test case input
        int[] arr = {1, 2,- 3, 3, -1, 2};

        // Call the method and print the output
        List<int[]> subarrays = findSubarraysWithZeroSum(arr);
        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}
