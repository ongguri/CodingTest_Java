import java.util.HashMap;
import java.util.Set;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        HashMap<Integer, Integer> strLenCountMap = new HashMap<Integer, Integer>();
        
        for(String str : strArr) {
            int len = str.length();
            strLenCountMap.put(len, strLenCountMap.getOrDefault(len, 0) + 1);
        }
        
        Set<Integer> strLenKey = strLenCountMap.keySet();
        for(int strLen : strLenKey) {
            answer = Math.max(answer, strLenCountMap.get(strLen));
        }
        return answer;
    }
}