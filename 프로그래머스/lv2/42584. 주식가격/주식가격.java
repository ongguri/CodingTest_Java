import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> pricesStack = new Stack<Integer>();
        
        for(int i = 0; i < prices.length; i++) { 
            while(!pricesStack.isEmpty() && prices[pricesStack.peek()] > prices[i]) {
                int prevIdx = pricesStack.pop();
                answer[prevIdx] = i - prevIdx;
            }
            pricesStack.push(i);
        }
        
        while(!pricesStack.isEmpty()) {
            int prevIdx = pricesStack.pop();
            answer[prevIdx] = (prices.length-1) - prevIdx;
        }
        return answer;
    }
}