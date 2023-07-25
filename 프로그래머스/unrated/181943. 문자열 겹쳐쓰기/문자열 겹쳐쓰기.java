class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        
        int overwrite_string_len = overwrite_string.length();
        int idx = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            if(i >= s && i < s + overwrite_string_len) {
                answer.append(overwrite_string.charAt(idx++));
                continue;
            }
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}