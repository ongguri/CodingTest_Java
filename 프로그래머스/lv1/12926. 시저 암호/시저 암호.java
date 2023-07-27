class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);
            if(s.charAt(i) == ' ') { 
                answer.append(" ");
            }
            else if(Character.isUpperCase(s.charAt(i))) {
                answer.append((char)((alpha - 'A' + n) % 26 + 'A'));
            }
            else if(!Character.isUpperCase(s.charAt(i))) {
                answer.append((char)((alpha - 'a' + n) % 26 + 'a'));
            }
        }
        return answer.toString();
    }
}