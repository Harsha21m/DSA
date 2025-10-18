
class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        String revstr = "";

        for (int i = str.length - 1; i >= 0; i--) {
            revstr = revstr + str[i] + " ";  
        }
        return revstr.trim(); 
    }
}
