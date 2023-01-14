class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        answer = n / slice;
        answer = (n % slice != 0) ? answer += 1 : answer;
        return answer;
    }
}