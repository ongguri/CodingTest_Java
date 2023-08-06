class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            int foodCount = food[i] / 2;
            for(int f = 0; f < foodCount; f++) {
                answer.append(Integer.toString(i));
            }
        }
        
        answer.reverse();
        String otherSideFood = answer.toString();
        answer.reverse();
        answer.append("0");
        answer.append(otherSideFood);
        
        
        return answer.toString();
    }
}