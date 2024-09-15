public class TrappingRainWater {

    public static int trap(int[] height) {
        int n = height.length;
        
        // Edge case: If there are less than 3 bars, no water can be trapped.
        if (n < 3) return 0;

        // Arrays to store the maximum height to the left and right of each bar.
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill the leftMax array.
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Fill the rightMax array.
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate the trapped water.
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            // Water trapped above the current bar is the difference between the current bar's height
            // and the minimum of the left and right maximum heights.
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {
        // Test cases
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {4, 2, 0, 3, 2, 5};
        int[] height3 = {1, 1, 1};
        int[] height4 = {5};
        int[] height5 = {2, 0, 2};

        System.out.println("Water trapped: " + trap(height1)); // Output: 6
        System.out.println("Water trapped: " + trap(height2)); // Output: 9
        System.out.println("Water trapped: " + trap(height3)); // Output: 0
        System.out.println("Water trapped: " + trap(height4)); // Output: 0
        System.out.println("Water trapped: " + trap(height5)); // Output: 2
    }
}
