import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dartResultArr = new int[3];
        
        StringBuilder resultStringbuilder = new StringBuilder();
        
        int scoreIdx = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            if(dartResult.substring(i, i+1).matches("[0-9]")) {
                resultStringbuilder.append(dartResult.charAt(i));
            }
            else if(dartResult.substring(i, i+1).matches("[S|D|T]")) {
                int bonus = 0;
                if(dartResult.charAt(i) == 'S') { bonus = 1; }
                if(dartResult.charAt(i) == 'D') { bonus = 2; }
                if(dartResult.charAt(i) == 'T') { bonus = 3; }
                
                dartResultArr[scoreIdx++] = 
                    (int)Math.pow(Integer.parseInt(resultStringbuilder.toString()), bonus);
                resultStringbuilder.setLength(0);
            }
            else if(dartResult.substring(i, i+1).matches("[*|#]")) {
                int option = 0;
                if(dartResult.charAt(i) == '*') { option = 2; }
                else if(dartResult.charAt(i) == '#') { option = -1; }
                
                if(scoreIdx > 1 && option != -1) {
                    dartResultArr[scoreIdx-2] *= option;
                }
                dartResultArr[scoreIdx-1] *= option;
            }
            
        }
        
        for(int score : dartResultArr) {
            answer += score;
        }
        
        return answer;
    }
}