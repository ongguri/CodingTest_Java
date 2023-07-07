import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        String[] shortArray = s1.length > s2.length ? s1 : s2;
        String[] longArray = s1.length > s2.length ? s2 : s1;
        
        ArrayList<String> longList = new ArrayList<String>(Arrays.asList(longArray));
        for(String str : shortArray) {
            if(longList.contains(str)) {
                answer++;
            }
        }
        return answer;
    }
}