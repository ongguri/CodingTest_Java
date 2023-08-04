import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Character> numList = new ArrayList<Character>();
        HashMap<Character, Integer> xMap = new HashMap<Character, Integer>();
        for(int m = 0; m < X.length(); m++) {
            xMap.put(X.charAt(m), xMap.getOrDefault(X.charAt(m), 0) + 1);
        }
        // System.out.println(xMap);
        
        for(int i = 0; i < Y.length(); i++) {
            char ch = Y.charAt(i);
            if(xMap.get(ch) != null && xMap.get(ch) != 0) {
                xMap.put(ch, xMap.get(ch) - 1);
                numList.add(ch);
            }
        }
        // System.out.println(xMap);
        // System.out.println(numList);
        Collections.sort(numList);
        
        for(int i = numList.size()-1; i >= 0; i--) {
            answer.append(numList.get(i));
            if(i == numList.size()-1 && numList.get(i) == '0') {
                break;
            }
        }
        if(answer.length() == 0) {
            answer.append("-1");
        }
        
        return answer.toString();
    }
}