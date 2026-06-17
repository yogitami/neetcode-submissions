class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Aopproach-2 
        int lengthS1 = s1.length();
        char ch[] = s1.toCharArray();
        Arrays.sort(ch);
        String newS1 = new String(ch);
    
        for(int i = 0; i<=s2.length()-lengthS1;i++){
            String s = s2.substring(i,i+lengthS1);
            char temp[] = s.toCharArray();
            Arrays.sort(temp);
            String tempString = new String(temp);
            if(tempString.equals(newS1)) {
                return true;
            }
        }
        return false;
    }
}
