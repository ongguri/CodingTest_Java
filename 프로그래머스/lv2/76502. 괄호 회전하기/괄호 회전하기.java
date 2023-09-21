import java.util.Stack;
import java.util.HashMap;

class Solution {
    private static HashMap<Character, Character> map = new HashMap<>();
    
    public int solution(String s) {
        int answer = 0;
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        for(int i = 0; i < s.length(); i++) {
            answer += checkBracket(s, i, s.length());
            System.out.println();
        }
        
        return answer;
    }
    
    public static int checkBracket(String s, int idx, int sLen) {
        Stack<Character> bracketStack = new Stack<Character>();
        if(s.charAt(idx) == ')' || s.charAt(idx) == '}' || s.charAt(idx) == ']') {
            return 0;
        }
        
        for(int i = idx; i < s.length()+idx; i++) {
            if(!bracketStack.isEmpty()) {
                if(map.get(bracketStack.peek()) != null && map.get(bracketStack.peek()) == s.charAt(i%sLen)) {
                    bracketStack.pop();
                    continue;
                }
            }
            bracketStack.push(s.charAt(i%sLen));
        }
        
        
        if(bracketStack.isEmpty()) {
            return 1;
        }
        
        return 0;
    }
}
