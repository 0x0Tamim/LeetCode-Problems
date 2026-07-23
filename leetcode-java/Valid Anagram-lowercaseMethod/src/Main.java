import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample test
        String s = "cat";
        String t = "car";

        Solution sol = new Solution();
        boolean ans = sol.isAnagram(s, t);

        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("Is Anagram? " + ans);
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[]freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i:freq){
            if(i != 0)
                return false;
        }
        return true;
    }
}
