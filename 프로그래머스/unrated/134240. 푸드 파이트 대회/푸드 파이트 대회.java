class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        int idx = 1;
        boolean reverse = false;
        while(idx != 0) {
            int foodCount = food[idx] / 2;
            
            if(idx == food.length-1) {
                answer.append(Integer.toString(idx).repeat(foodCount));
                answer.append("0");
                reverse = !reverse;
            }
            
            if(!reverse) {
                answer.append(Integer.toString(idx++).repeat(foodCount));
            }
            else if(reverse) {
                answer.append(Integer.toString(idx--).repeat(foodCount));
            }
            
            
        }
        return answer.toString();
    }
}