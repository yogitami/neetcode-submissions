class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int right = 0; 
        int maxLength = 0;
        while(right < s.length()){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
                maxLength = Math.max(maxLength,right-left+1);
               charSet.add(s.charAt(right));
                right++;
        }
    return maxLength;
    }
}
