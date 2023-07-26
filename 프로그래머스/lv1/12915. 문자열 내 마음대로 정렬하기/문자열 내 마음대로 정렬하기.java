import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> strArr = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < strings.length; i++) {
            sb.append(strings[i].charAt(n));
            sb.append(strings[i]);
            strArr.add(sb.toString());
            sb.setLength(0);
        }

        Collections.sort(strArr);
        
        String[] answer = new String[strArr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = strArr.get(i).substring(1, strArr.get(i).length());
        }
        
        return answer;
    }
}