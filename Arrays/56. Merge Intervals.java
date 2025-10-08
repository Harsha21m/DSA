import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        //Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        //Use a List to store merged intervals
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            // If list is empty or no overlap
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } 
            // Overlapping intervals
            else {
                ans.get(ans.size() - 1).set(1,
                    Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
        }

        // Convert List<List<Integer>> to int[][]
        int[][] merged = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            merged[i][0] = ans.get(i).get(0);
            merged[i][1] = ans.get(i).get(1);
        }

        return merged;
    }
}
