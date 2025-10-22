
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
              return false;
        }

        int [] count=new int[26];

        for(int i=0;i<s.length();i++){
           count[s.charAt(i)-'a']++; //get the correct index
           count[t.charAt(i)-'a']--;           
        }
        
        for(int i=0;i<count.length;i++){
            if(count[i]!=0)return false;
        }
        return true;
    }
}

=============================================================================================================================================
public class Solution {
    public boolean isAnagram(String s, String t) {
        // Create two HashMaps to store the frequency of characters
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        // Populate the map for string s
        for (char c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }
        
        // Populate the map for string t
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }
        
        // Compare both maps
        return mapS.equals(mapT);
    }
}
============================================================================================================================================================
  class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1= s.toCharArray();
        char[] arr2= t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result = Arrays.equals(arr1, arr2);
        return result;

    }
    
}
