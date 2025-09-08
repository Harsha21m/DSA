

class Solution {
    public int subarraySum(int[] nums, int k)  {
        // code here
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,1);
       
       int prefix = 0;
       int count = 0;
       for(int i=0; i<nums.length; i++){
        prefix = prefix + nums[i];
     
        int val = prefix - k;
        if(map.containsKey(val)){
            count = count + map.get(val);
        }
       map.put(prefix, map.getOrDefault(prefix,0)+1);
     
       }
       return count;
    }
}

============================================================================================================



//Brute force
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum = sum+nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
   return count;
    }
}

========================================================================================================
// took additional array
  class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefixarr[] = new int[n];
        prefixarr[0] = nums[0];
        for (int i = 1; i < prefixarr.length; i++) {
            prefixarr[i] = prefixarr[i - 1] + nums[i];
        }
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < prefixarr.length; j++) {
            if (prefixarr[j] == k) {
                count++;
            }

            int val = prefixarr[j] - k;
            if (map.containsKey(val)) {
                count = count + map.get(val);
            }
            map.put(prefixarr[j], map.getOrDefault(prefixarr[j], 0) + 1);
        }
        return count;
    }
}
