class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n / a != 0) {
            int getBottle = n / a * b;
            answer += getBottle;
            n = n % a + getBottle;
        }
        
        return answer;
    }
}