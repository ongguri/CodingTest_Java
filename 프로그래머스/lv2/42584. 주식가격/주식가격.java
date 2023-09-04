class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        int idx = 0;
        for(int i = 0; i < prices.length-1; i++) {
            int time = 0;
            for(int j = i+1; j < prices.length; j++) {
                time++;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
            answer[idx++] = time;
        }
        return answer;
    }
}