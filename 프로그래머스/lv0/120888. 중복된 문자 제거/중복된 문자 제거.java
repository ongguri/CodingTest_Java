import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int s = 0; s < my_string.length(); s++) {
            if(!answer.contains(my_string.substring(s, s+1))) {
                answer += my_string.charAt(s);
            }
        }
        return answer;
    }
}