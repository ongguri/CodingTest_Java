class Solution {
    public int solution(int n) {
        String nBin = Integer.toBinaryString(n);
        int len = countOne(nBin);
        
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