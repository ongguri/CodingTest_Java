import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer);
        
        for(int i = 0; i < answer.length/2; i++) {
            String tmp = answer[i];
            answer[i] = answer[answer.length-i-1];
            answer[answer.length-i-1] = tmp;
        }
        return String.join("", answer);
    }
}