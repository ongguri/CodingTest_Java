import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> strList = new ArrayList<String>();
        
        for(String str : strArr) {
            if(!str.contains("ad")) {
                strList.add(str);
            }
        }
        
        String[] answer = strList.toArray(new String[strList.size()]);
        return answer;
    }
}