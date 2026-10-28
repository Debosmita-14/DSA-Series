class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] CharC = new int[26];
       for(char c:magazine.toCharArray()){
        CharC[c-'a']++;
       } 
       for(char r:ransomNote.toCharArray()){
        if(CharC[r-'a']==0)
            return false;
        CharC[r-'a']--;
       }
       return true;
    }
}