class Solution{
public char findTheDifference(String s, String t) {
    char result = 0;
    for (char i : s.toCharArray()) {
        result ^= i;
    }
    for (char j : t.toCharArray()) {
        result ^= j;
    }
    return result;
}
}
        
