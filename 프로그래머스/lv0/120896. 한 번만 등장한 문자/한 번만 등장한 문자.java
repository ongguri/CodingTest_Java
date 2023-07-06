import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i+1);
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for(Entry<String, Integer> entrySet : map.entrySet()) {
            if(entrySet.getValue() > 1) {
                continue;
            }
            answer += entrySet.getKey();
        }
        
        char[] ch = answer.toCharArray();
        Arrays.sort(ch);
        answer = new String(ch);
        
        return answer;
    }
}