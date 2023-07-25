class Solution {
    public int solution(int n) {
        int pow = (n % 2 == 0) ? 2 : 1;
        int answer = 0;
        for(int i = n; i >= 0; i -= 2) {
            answer += (int)Math.pow(i, pow);
        }
        return answer;
    }
}