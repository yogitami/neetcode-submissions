class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        String regenerateFirst = new String(first);
        String regenerateSecond = new String(second); 
        return regenerateFirst.equals(regenerateSecond);
    }
}
