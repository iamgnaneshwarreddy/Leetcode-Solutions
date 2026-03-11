import java.util.HashSet;

public class longest_substring_with_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();
        int l = 0;
        int r = l;
        int maxL = 0;
        while(r<s.length()){
            
            while(hset.contains(s.charAt(r))){

                hset.remove(s.charAt(l));
                l++;
            }
            hset.add(s.charAt(r));
            maxL = Math.max(maxL,r-l+1);
            r++;

        }
        return maxL;
    }
}
