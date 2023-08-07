import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        int count = 0;
        for(int s = score.length-1; s >= 0; s--) {
            count++;
            if(count == m) {
                answer += score[s] * m;
                count = 0;
            }
        }
        return answer;
    }
}