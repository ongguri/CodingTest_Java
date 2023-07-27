class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0 && Math.pow(i, 2) != n) {
                answer += i;
                answer += n / i;
            }
            else if(Math.pow(i, 2) == n) {
                answer += i;
            }
        }
        return answer;
    }
}