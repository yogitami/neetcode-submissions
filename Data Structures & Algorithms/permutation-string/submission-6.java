class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];


        for(int i = 0; i < s1.length(); i++){
            freqS1[s1.charAt(i) - 'a']++;
            freqS2[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for(int i = 0; i < 26; i++){
            if(freqS1[i] == freqS2[i]) matches++;
        }

        int left = 0;
        int right = s1.length();
        while(right < s2.length()){
            if(matches == 26) return true;

            int index = s2.charAt(right) - 'a';
            freqS2[index]++;
            if(freqS1[index] == freqS2[index]) matches++;
            else if(freqS1[index]+1 == freqS2[index]) matches--;

            int indexLeft = s2.charAt(left) - 'a';
            freqS2[indexLeft]--;
            if(freqS1[indexLeft] == freqS2[indexLeft]) matches++;
            else if(freqS1[indexLeft]-1 == freqS2[indexLeft]) matches--;

            left++;
            right++;
        }
        if(matches == 26) return true;
        return false;
    }
}
