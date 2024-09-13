import java.util.ArrayList;
import java.util.List;

public class LeaderElements {
    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        
        // Start from the last element
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight); // Last element is always a leader
        
        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i]; // Update the maxFromRight
            }
        }
        
        // Reverse the list to maintain the original order
        List<Integer> result = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            result.add(leaders.get(i));
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leaders: " + leaders);
    }
}
