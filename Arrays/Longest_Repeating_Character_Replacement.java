import java.util.HashMap;

class Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        int maxLen = 0;
        while(r < s.length()){
            hmap.put(s.charAt(r),hmap.getOrDefault(s.charAt(r),0)+1);
            if(hmap.get(s.charAt(r))>maxFreq){
                maxFreq = hmap.get(s.charAt(r));
            }
            if((r - l + 1) - maxFreq > k){
                hmap.put(s.charAt(l),hmap.getOrDefault(s.charAt(l),0)-1);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}