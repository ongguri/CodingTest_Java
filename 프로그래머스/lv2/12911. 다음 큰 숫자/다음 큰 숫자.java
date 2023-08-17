class Solution {
    public int solution(int n) {
        int len = countOne(Integer.toBinaryString(n));
        
        while(countOne(Integer.toBinaryString(++n)) != len) {
        }
        
        return n;
    }
    
    public int countOne(String nBin) {
        int count = 0;
        for(int i = 0; i < nBin.length(); i++) {
            if(nBin.charAt(i) == '1') {
                count++;
            }
        }
        
        return count;
    }
}