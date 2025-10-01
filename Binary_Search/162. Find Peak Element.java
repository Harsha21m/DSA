class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n < 2) {       // handling edge cases
            return 0;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

        int left = 1;  // actual logic 
        int right = n - 2;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            else if (nums[mid] > nums[mid - 1]) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

=====================================================================================================
lenear search code
  // class Solution {
//     public int findPeakElement(int[] nums) {
//         if(nums.length < 2){
//             return 0;
//         }
//         if(nums[0] > nums[1]){
//             return 0;
//         }
//           if(nums[nums.length-1] > nums[nums.length-2]){
//             return nums.length-1;
//         }

//         for(int i=1; i<=nums.length-2;i++){
//            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
//             return i;
//            }
//         }

//        return 0;
//     }
// }
