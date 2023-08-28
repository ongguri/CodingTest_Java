class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i == 0 || s.charAt(i-1) == ' ' && Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            else if(s.charAt(i-1) != ' ' && Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }
            answer.append(ch);
        }
        
        return answer.toString();
    }
}