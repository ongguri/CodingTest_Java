import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
                continue;
            }
            answer += my_string.charAt(i);
        }
        char[] str = answer.toCharArray();
        Arrays.sort(str);
        
        return new String(str);
    }
}