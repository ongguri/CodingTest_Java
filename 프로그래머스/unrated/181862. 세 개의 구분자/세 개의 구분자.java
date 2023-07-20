import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] myStrSplit = myStr.split("[a|b|c]");
        
        ArrayList<String> strList = new ArrayList<String>();
        for(String str : myStrSplit) {
            if(!str.equals("")) {
                strList.add(str);
            }
        }
        
        String[] answer = strList.toArray(new String[strList.size()]);
        if(answer.length == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        return answer;
    }
}