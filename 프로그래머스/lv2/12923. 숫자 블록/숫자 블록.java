class Solution {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int)(end-begin+1)];
        
        int idx = 0;
        for(int i = (int)begin; i <= end; i++) {
            int max = 0;
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i == 1) { break; }
                if(i % j == 0) {
                    max = Math.max(max, j);
                    if(i / j != i && i / j <= 10000000) {
                        max = Math.max(max, i/j);
                    }
                }
            }
            answer[idx++] = max;
        }
        
        return answer;
    }
}