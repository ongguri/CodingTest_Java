class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);
            if(s.charAt(i) == ' ') { 
                answer.append(" ");
            }
            else if(Character.isUpperCase(s.charAt(i))) {
                if(alpha+n > 'Z') {
                    answer.append((char)(alpha + n - 26));
                    continue;
                }
                answer.append((char)(alpha + n));
            }
            else if(!Character.isUpperCase(s.charAt(i))) {
                if(alpha+n > 'z') {
                    answer.append((char)(alpha + n - 26));
                    continue;
                }
                answer.append((char)(alpha + n));
            }
        }
        return answer.toString();
    }
}