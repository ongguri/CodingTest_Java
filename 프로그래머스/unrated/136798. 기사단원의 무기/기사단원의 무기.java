class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int count = sosuCount(i);
            answer += (count > limit) ? power : count;
        }
        
        return answer;
    }
    
    public static int sosuCount(int num) {
        int result = 0;
        
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                result += 2;
                
                if(num / i == i) {
                    result -= 1;
                }
            }
        }
        
        return result;
    }
}