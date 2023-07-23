import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> resultList = new ArrayList<String>();
        for(int i = 0; i < my_string.length(); i++) {
            resultList.add(my_string.substring(i, my_string.length()));
        }
        
        Collections.sort(resultList);
        String[] answer = resultList.toArray(new String[resultList.size()]);
        
        return answer;
    }
}