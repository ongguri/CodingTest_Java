class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] numberArr = new int[10];
        
        for(int num : numbers) {
            numberArr[num]++;
        }
        
        for(int i = 0; i <= 9; i++) {
            if(numberArr[i] == 0) { answer += i; }
        }
        
        return answer;
    }
}