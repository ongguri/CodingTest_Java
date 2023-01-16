class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int idx = 0;
        int count = 0;
        while(count != k) {
            answer = numbers[idx % numbers.length];
            idx += 2;
            count++;
        }
        return answer;
    }
}