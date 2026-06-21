class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        String ans = "";

        Map<Character,Integer> tfreq = new HashMap<>();
        Map<Character,Integer> sfreq = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            tfreq.put(t.charAt(i), tfreq.getOrDefault(t.charAt(i),0)+1);
        }

        int distinctCharInT = tfreq.size();
        int left = 0;
        int right = 0;
        int matches = 0;
        
        while(right < s.length()){
            sfreq.put(s.charAt(right), sfreq.getOrDefault(s.charAt(right),0)+1);
            if(sfreq.get(s.charAt(right)).equals(tfreq.getOrDefault(s.charAt(right),0))) matches++;
            while(matches == distinctCharInT){
                if(ans.equals("") || (right + 1 - left) < ans.length()){
                ans = s.substring(left,right+1);
                }
                if(sfreq.get(s.charAt(left)).equals(tfreq.getOrDefault(s.charAt(left),0))) matches--;
                sfreq.put(s.charAt(left), sfreq.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            right++;
        }

        return ans;
    }
}
