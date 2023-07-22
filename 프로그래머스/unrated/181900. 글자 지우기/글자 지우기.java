import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] my_string_arr = my_string.split("");
        
        for(int ind : indices) {
            my_string_arr[ind] = "";
        }
        
        answer = String.join("", my_string_arr);
        return answer;
    }
}