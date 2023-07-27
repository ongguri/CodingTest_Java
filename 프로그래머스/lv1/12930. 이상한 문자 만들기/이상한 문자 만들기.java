class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] sCharArr = s.toCharArray();
        
        int charIdx = 0;
        for(int i = 0; i < sCharArr.length; i++) {
            if(sCharArr[i] == ' ') {
                answer.append(" ");
                charIdx = 0;
                continue;
            }
            else if(charIdx % 2 == 0) {
                answer.append(Character.toUpperCase(sCharArr[i]));
            }
            else if(charIdx % 2 != 0) {
                answer.append(Character.toLowerCase(sCharArr[i]));
            }
            charIdx++;
        }
        
        return answer.toString();
    }
}