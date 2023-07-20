import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        String[] myStringArr = myString.split("x");
        ArrayList<String> str = new ArrayList<String>();
        for(String s : myStringArr) {
            if(!s.equals("")) {
                str.add(s);
            }
        }
        Collections.sort(str);
        String[] answer = str.toArray(new String[str.size()]);
        return answer;
    }
}