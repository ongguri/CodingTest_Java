import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int str = 0; str < my_string.length(); str++){
            for(int i = 0; i < n; i++) {
                answer += my_string.charAt(str);
            }
        }
        return answer;
    }
}