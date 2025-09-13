// optimal (2 pointers )
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    ArrayList<Integer> sublist = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    list.add(sublist);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return list;
    }
}

======================================================================================================================================================
  //better approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            HashSet<Integer> hset = new HashSet<>();
            for(int j=i+1; j<nums.length;j++){
                int third = -(nums[i] + nums[j]);
                    if(hset.contains(third)){
                    List<Integer> list =  Arrays.asList(nums[i], nums[j], third);
                    list.sort(null);
                    set.add(list);  
                    }
                    hset.add(nums[j]);
                }
            }
    List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}


===========================================================================================================
// Brute force
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> list = new HashSet<>();

      for(int i=0; i<nums.length-2; i++){
        for(int j=i+1; j<nums.length-1; j++){
            for(int k = j+1; k<nums.length; k++){
                if(nums[i]+nums[j]+nums[k] == 0){
             ArrayList<Integer> sublist = new ArrayList<>();
                    sublist.add(nums[i]);
                    sublist.add(nums[j]);
                    sublist.add(nums[k]);
                    Collections.sort(sublist); 
                    list.add(sublist);
                }
            }
        }
      }
      return new ArrayList<>(list);
    }
}

