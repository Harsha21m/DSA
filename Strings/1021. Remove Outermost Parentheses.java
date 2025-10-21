class Solution {
    public String removeOuterParentheses(String s) {
      StringBuilder str = new StringBuilder();
      int i = 0;
      int open = 0;
      int close = 0;

      for(int j=0; j<s.length(); j++){
          if(s.charAt(j) == '('){
            open += 1;
          }
          else{
            close += 1;
          }

        if(open == close){
         str.append(s.substring(i+1,j));

           i = j+1;
           open = 0;
           close = 0;
        }
      }
      return str.toString();  
    }
}

==========================================================================================================

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;  

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    result.append(c); 
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
