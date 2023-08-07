import java.util.Stack;
import java.util.Arrays;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> ingredientStack = new Stack<Integer>();
        int[] bugger = {1, 3, 2, 1};
        
        int idx = 0;
        while(idx < ingredient.length) {
            ingredientStack.push(ingredient[idx++]);
            
            while(ingredientStack.size() >= 4 && ingredientStack.peek() == 1) {
                int[] makeBugger = new int[4];
                for(int i = 0; i < 4; i++) {
                    makeBugger[i] = ingredientStack.pop();
                }
                
                if(!Arrays.equals(bugger, makeBugger)) {
                    for(int i = 3; i >= 0; i--) {
                        ingredientStack.push(makeBugger[i]);
                    }
                    break;
                }
                answer++;
            }
        }
        return answer;
    }
}