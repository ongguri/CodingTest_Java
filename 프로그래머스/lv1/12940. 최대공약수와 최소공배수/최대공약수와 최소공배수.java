class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1, n * m};
        
        while(n % m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        answer[0] = m;
        answer[1] = answer[1] / m;
        
        return answer;
    }
}