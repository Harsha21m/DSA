class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find maximum from piles
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        ///find the lowest bananas per hour
        int low = 1;
        int high = max;
        int totalH;
        while (low <= high) {
            int mid = (low + high) / 2;
            totalH = totalHours(piles, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

   // checking the each value  from 1 to max by deviding values of pilse
    public static int totalHours(int piles[], int mid) {
        int totalforthis = 0;
        for (int i = 0; i < piles.length; i++) {
            totalforthis += Math.ceil((double) piles[i] / (double) mid);
        }
        return totalforthis;
    }
}
