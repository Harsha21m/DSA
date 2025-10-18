class Solution {
    public boolean wordPattern(String pattern, String s) {

        int n = pattern.length();
        HashMap<Character,String> map = new HashMap<>();
       
        char ch[] = pattern.toCharArray();
        String str[] = s.split(" ");

        if(str.length != n){
            return false;
        }
        
        for(int i=0; i<n; i++){
            if(map.containsKey(ch[i])){
                if(!(map.get(ch[i]).equals(str[i]))){
                    return false;
                }
            }
            else{
                if(map.containsValue(str[i])){
                    return false;
                }
                map.put(ch[i],str[i]); // if key not there
            }
        }
       return true;
    }
}
