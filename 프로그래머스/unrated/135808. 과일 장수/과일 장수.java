import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        for(int s = score.length; s >= m; s -= m) {
            answer += score[s-m] * m;

        }
        return answer;
    }
}