import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> strArr = new ArrayList<String>();
        
        int count = 0;
        String str = "";
        for(int i = 0; i < my_str.length(); i++) {
            count++;
            str += my_str.substring(i, i+1);
            if(count == n) {
                strArr.add(str);
                count = 0;
                str = "";
            }
        }
        if(count != 0) {
            strArr.add(str);
        }
        
        String[] answer = new String[strArr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = strArr.get(i);
        }
        
        return answer;
    }
}