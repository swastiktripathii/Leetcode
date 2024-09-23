class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newstring = new StringBuilder();
        int i = 0, j = 0;

        while(i < word1.length() && j < word2.length()){
            newstring.append(word1.charAt(i++));
            newstring.append(word2.charAt(j++));
        }

        if(i < word1.length()){
            newstring.append(word1.substring(i));
        }
        if(j < word2.length()){
            newstring.append(word2.substring(j));
        }
        return newstring.toString();
    }
}