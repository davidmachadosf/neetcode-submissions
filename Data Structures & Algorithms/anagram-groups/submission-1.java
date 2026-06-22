class Solution {
    
    private String sortChars(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    private int hashAnagram(String str) {
        return sortChars(str).hashCode();
    }



    public List<List<String>> groupAnagrams(String[] strs) {
        
        Hashtable<Integer,List<String>> hash = new Hashtable<>();
        int key;
        List<String> group;
        List<List<String>> groups = new ArrayList<>();

        for(String str:strs){
            key = hashAnagram(str);
            group = hash.get(key);
            if(group==null){
                group = new ArrayList<String>();
                hash.put(key,group);
                groups.add(group);
            }
            group.add(str);
        }

        return groups;
    }
}
