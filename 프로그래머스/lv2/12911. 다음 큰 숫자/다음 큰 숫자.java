class Solution {
    public int solution(int n) {
        String nBin = Integer.toBinaryString(n);
        nBin = nBin.replace("0", "");
        int len = nBin.length();
        
        while(Integer.toBinaryString(n+1).replace("0", "").length() != len) {
            n++;
        }
        return n+1;
    }
}