class Solution {
    public String solution(String s) {
        int sLen = s.length();
        return s.substring((sLen-1)/2, sLen/2+1);
    }
}