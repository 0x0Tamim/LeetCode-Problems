import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases (you can edit these)
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));         // false
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer>map = new HashMap<>();
         for(char c:s.toCharArray()){
             map.put(c,map.getOrDefault(c,0)+1);
         }

         for(char c:t.toCharArray()){
             if(!map.containsKey(c)) return false;
             map.put(c,map.get(c)-1);
             if(map.get(c)==0){
                 map.remove(c);
             }
         }
         return map.isEmpty();
    }
}
