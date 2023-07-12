import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] str = my_string.toCharArray();
        
        for(int i = 0; i < str.length; i++) {
            char s = str[i];
            if(Character.isUpperCase(s)) {
                str[i] = Character.toLowerCase(s);
            }
        }
        Arrays.sort(str);
        
        return new String(str);
    }
}