


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        
        return ans;
    }
}
















// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 list1.add(nums[i]);
//             } else {
//                 list2.add(nums[i]);
//             }
//         }
//         int count1 = 0;
//         int count2 = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (i % 2 == 0) {
//                 nums[i] = list1.get(count1);
//                 count1++;
//             } else {
//                 nums[i] = list2.get(count2);
//                 count2++;
//             }
//         }
//         return nums;
//     }
// }
