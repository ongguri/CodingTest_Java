class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int prevNum = 0, curNum = 1;
        for(int i = 2; i <= n; i++) {
            answer = (prevNum + curNum) % 1234567;
            prevNum = curNum;
            curNum = answer;
        }
        return answer % 1234567;
    }
}