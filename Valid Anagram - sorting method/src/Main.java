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
        char[]a = s.toCharArray();
        char[]b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
