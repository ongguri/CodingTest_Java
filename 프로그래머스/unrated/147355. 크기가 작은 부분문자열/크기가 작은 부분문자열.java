class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        long pNum = Long.parseLong(p);
        
        for(int i = 0; i <= t.length()-pLen; i++) {
            long sliceNum = Long.parseLong(t.substring(i, i+pLen));
            if(sliceNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}