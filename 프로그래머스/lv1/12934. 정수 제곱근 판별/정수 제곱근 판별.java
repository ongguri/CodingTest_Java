class Solution {
    public long solution(long n) {
        long answer = 0;
        double nSqrt = Math.sqrt(n);
        answer = (nSqrt % 1 == 0) ? (long)Math.pow(nSqrt+1, 2) : -1;
        
        return answer;
    }
}