class Solution {

    private String sortChars(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public boolean isAnagram(String s, String t) {
        return sortChars(s).equals(sortChars(t));
    }
}
