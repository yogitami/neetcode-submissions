class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        char[] charS1 = s1.toCharArray();
        Arrays.sort(charS1);
        String newS1 = new String(charS1);
        int lengthS1 = s1.length();

        for(int i = 0; i <= s2.length()-lengthS1; i++){
            String s2SubStr = s2.substring(i,i+lengthS1);
            char[] chS2 = s2SubStr.toCharArray();
            Arrays.sort(chS2);
            String newS2 = new String(chS2);
            if(newS2.equals(newS1)) return true;
        }
        return false;

    }
}
