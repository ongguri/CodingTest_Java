class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(boolean include : included) {
            if(include) {
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}