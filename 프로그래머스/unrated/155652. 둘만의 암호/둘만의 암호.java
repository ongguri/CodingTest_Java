import java.util.HashMap;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        HashMap<Character, Integer> skipMap = new HashMap<Character, Integer>();
        for(int i = 0; i < skip.length(); i++) {
            skipMap.put(skip.charAt(i), 0);
        }
        // System.out.println(skipMap);
        
        for(int i = 0; i < s.length(); i++) {
            int idxCount = 0;
            char ch = s.charAt(i);
            while(idxCount < index) {
                ch = (char)((ch+1 - 'a') % 26 + 'a');
                if(skipMap.get(ch) != null) {
                    continue;
                }
                idxCount++;
            }
            answer.append(ch);
        }
        
        return answer.toString();
    }
}