import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        LinkedHashSet<String> strSet = new LinkedHashSet<String>(Arrays.asList(answer));
        return String.join("", strSet);
    }
}