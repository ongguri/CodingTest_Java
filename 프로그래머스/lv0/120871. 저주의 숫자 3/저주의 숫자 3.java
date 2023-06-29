class Solution {
    public int solution(int n) {
        int answer = 1;
        int number = 1;
        
        while(number <= n) {
            if(answer%3 == 0 || Integer.toString(answer).contains("3")){
                answer++;
                continue;
            }
            answer++;
            number++;
        }
        return answer-1;
    }
}