class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int nextPaint = 0;
        int currentPaint = 0;
        while(nextPaint < section.length) {
            for(int i = 0; i < m; i++) {
                if(section[currentPaint]+i == section[nextPaint]) {
                    nextPaint++;
                    if(nextPaint >= section.length) { break; }
                }
            }
            answer++;
            currentPaint = nextPaint;
        }
        return answer;
    }
}