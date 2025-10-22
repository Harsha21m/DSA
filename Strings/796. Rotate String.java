class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}

======================================================================================================


class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.equals(goal)) return true;

        for(int i=0; i<s.length(); i++){
           String str = "";
           str = str + s.substring(i+1,s.length());
           str = str + s.substring(0,i+1);

           if(str.equals(goal)){
            return true;
           }
        }
        return false;
    }
}


