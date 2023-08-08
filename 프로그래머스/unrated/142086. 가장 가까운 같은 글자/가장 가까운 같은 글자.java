import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> prevStr = new HashMap<Character, Integer>();
        
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(prevStr.get(ch) == null) {
                answer[idx++] = -1;
                prevStr.put(ch, i+1);
            }
            else {
                answer[idx++] = (i+1) - prevStr.get(ch);
                prevStr.put(ch, i+1);
            }
        }
        
        return answer;
    }
}