import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] myStringArr = my_string.split(" ");
        
        ArrayList<String> strList = new ArrayList<String>();
        for(String strArr : myStringArr) {
            if(strArr.equals("")) {
                continue;
            }
            strList.add(strArr);
        }
        
        String[] answer = strList.toArray(new String[strList.size()]);
        return answer;
    }
}