class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < numLog.length; i++) {
            if(numLog[i-1]+1 == numLog[i]) { answer.append("w"); }
            else if(numLog[i-1]-1 == numLog[i]) { answer.append("s"); }
            else if(numLog[i-1]+10 == numLog[i]) { answer.append("d"); }
            else if(numLog[i-1]-10 == numLog[i]) { answer.append("a"); }
        }
        
        return answer.toString();
    }
}