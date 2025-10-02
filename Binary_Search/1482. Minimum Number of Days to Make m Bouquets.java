class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length < (long)m*k){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<bloomDay.length; i++){
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }

        int low = min;
        int high = max;

        while( low <= high){
            int mid = (low + high) / 2;
            if(possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
          }
          return low;
        }



    public static boolean possible(int[] bloomDay, int mid, int m, int k) {
        int n = bloomDay.length;
        int cnt = 0;
        int noOfBoq = 0;
        // Counting the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= mid) {
                cnt++;
            } else {
                noOfBoq += (cnt / k);
                cnt = 0;
            }
        }
        noOfBoq += (cnt / k);
        return noOfBoq >= m;
      }
}
