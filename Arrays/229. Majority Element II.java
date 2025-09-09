//Boyer Moore algorithm 

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = 0;
        int ele2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0; i<nums.length; i++){
            if(cnt1 == 0 && nums[i]!= ele2){
                ele1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0 && nums[i]!= ele1){
                ele2 = nums[i];
                cnt2 = 1;
            }
            else if(nums[i] == ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;cnt2--;
            }
        }

    //Manually check if the stored elements in
        // el1 and el2 are the majority elements:
      ArrayList<Integer> list = new ArrayList<>();
      cnt1 = 0; cnt2 = 0;
      for(int i=0; i<nums.length;i++){
        if(nums[i] == ele1){
            cnt1++;
        }
        if(nums[i]== ele2){
            cnt2++;
        }
      }
      int size = nums.length/3;
      if(cnt1 > size){
        list.add(ele1);
      }
      if(cnt2 > size ele2 != ele1){
        list.add(ele2);
      } 
      return list;
    }
}



===========================================================================================================


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int s = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }

        for (int key : map.keySet()) {
            int val = map.get(key);
            if (val > s) {
                list.add(key);
            }
        }
        return list;
    }
}
