class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        while(num <= n) {
            if(n == 1) return answer;
            num *= ++answer;
        }
        return answer-1;
    }
}