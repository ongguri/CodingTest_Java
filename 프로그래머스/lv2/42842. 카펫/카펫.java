class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown+yellow;
        
        for(int i = 3; i <= Math.sqrt(total); i++) {
            int width = total/i;
            if(total%i == 0 && total - (width*2) - (i-2)*2 == yellow) {
                answer[0] = width;
                answer[1] = i;
                break;
            }
            
        }
        
        return answer;
    }
}