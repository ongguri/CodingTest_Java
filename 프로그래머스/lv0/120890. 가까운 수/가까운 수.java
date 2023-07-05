class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDist = 100;
        
        for(int num : array) {
            if(Math.abs(num - n) <= minDist) {
                if(Math.abs(num - n) == minDist && answer < num) { continue; }
                minDist = Math.abs(num - n);
                answer = num;
            }
        }
        return answer;
    }
}