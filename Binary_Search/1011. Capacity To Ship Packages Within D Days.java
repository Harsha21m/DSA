class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for(int i=0; i<weights.length; i++){
            sum =  sum + weights[i];
        }

        int max = Integer.MIN_VALUE;
         for(int i=0; i<weights.length; i++){
            max = Math.max(max, weights[i]);
        }
        
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = (low + high) / 2;
            int numberofdays = finddays(weights, mid);

            if(numberofdays <= days){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
       return low;
    }


    public static  int finddays(int weights[],int mid){
       int days = 1; 
       int load = 0;

       for(int i=0; i<weights.length; i++){
          if(weights[i] + load > mid){
            days = days + 1;
            load = weights[i];
          }
          else{
            load = load + weights[i];
          }
       }
       return days;
    }
}
