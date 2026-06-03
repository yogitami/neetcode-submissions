class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> sortedMap = new HashMap<>();
        // strs = ["act","pots","tops","cat","stop","hat"]
        for(String str : strs){
            char[] word = str.toCharArray();
            Arrays.sort(word);
            sortedMap.putIfAbsent(String.valueOf(word),new ArrayList<>());
            sortedMap.get(String.valueOf(word)).add(str);
        }

        return new ArrayList<>(sortedMap.values());
    }
}
