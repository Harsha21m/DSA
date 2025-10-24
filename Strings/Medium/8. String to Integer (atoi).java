class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if(s.length()==0){
            return 0;
        }

        int sign = 1;
        long ans = 0;
        int i=0;
     // assign the value for sign -1 or 1 and i becomes 1
      if (s.charAt(0) == '+') {
            sign = 1;
            i++;
        } else if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        }


        while(i<s.length()){
           if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))){
            break;
           }
           int digit = (s.charAt(i) - '0');
           ans = ans * 10 + digit;

           if(sign * ans > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
           }
           if(sign * ans < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
           }

           i++;
        }

        return (int)(sign * ans);
    }
}
