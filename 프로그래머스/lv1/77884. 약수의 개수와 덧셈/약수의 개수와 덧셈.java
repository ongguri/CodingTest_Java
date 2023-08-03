class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            answer += (divisorCount(i)) ? i : i * (-1);
            
        }
        
        return answer;
    }
    
    public boolean divisorCount(int num) {
        boolean isEven = true;
        
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if((num % i == 0) && (num / i == i)) {
                isEven = false;
                break;
            }
        }
        
        return isEven;
    }
}