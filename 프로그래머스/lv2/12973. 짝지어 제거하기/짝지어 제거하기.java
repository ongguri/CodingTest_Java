import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        if(s.length() % 2 != 0) { return 0; }
        
        for(int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) { stack.pop(); }
            else { stack.push(s.charAt(i)); }
        }
        
        return (stack.isEmpty()) ? 1 : 0;
    }
}