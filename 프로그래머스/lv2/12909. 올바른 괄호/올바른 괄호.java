import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> bracketStack = new Stack<Character>();
        
        if(s.charAt(0) == ')') { return false; }
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                bracketStack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')') {
                if(bracketStack.empty() || bracketStack.pop() != '(') { 
                    answer = false;
                    break;
                }
            }
        }
        
        if(!bracketStack.empty()) { answer = false; }

        return answer;
    }
}