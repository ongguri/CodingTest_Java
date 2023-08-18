class Solution {
    public long solution(int n) {
        long curNum = 2, prevNum = 1;
        int div = 1234567;
        
        if(n == 1) { return prevNum; }
        
        for(int i = 2; i < n; i++) {
            long sumNum = (curNum + prevNum) % div;
            prevNum = curNum;
            curNum = sumNum;
        }
        
        return curNum;
    }
}