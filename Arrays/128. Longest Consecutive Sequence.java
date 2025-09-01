
// Optimal Solution
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int largest = 1;

        if(nums.length < 1){
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int val : set) {
            if (!set.contains(val - 1)) {
                int count = 1;
                int start = val;
                while (set.contains(start+1)) {
                    count = count + 1;
                    start = start + 1;
                }
                largest = Math.max(largest, count);
            }
        }

        return largest;
    }
}







// Better approach O(n logn) to sort
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 0) {
            return 0;
        }

        int last_Smaller = Integer.MIN_VALUE;
        int count = 1;
        int longest = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == last_Smaller) { // in the case if 100 last_smaller should be 99.(nums[i] - 1)
                count = count + 1;
                last_Smaller = nums[i];
            } else if (last_Smaller != nums[i]) {
                count = 1;
                last_Smaller = nums[i];
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }
}
