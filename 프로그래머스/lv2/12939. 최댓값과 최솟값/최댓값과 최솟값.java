class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sArr = s.split(" ");
        
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(String strNum : sArr) {
            Long num = Long.parseLong(strNum);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        answer.append(min);
        answer.append(" ");
        answer.append(max);
        
        return answer.toString();
    }
}