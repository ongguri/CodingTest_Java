import java.util.Arrays;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int landLen = land[0].length;

        int x = 1, landIdx = 0;
        while(x < land.length) {
            int maxScore = 0;
            for(int l = 0; l < landLen; l++) {
                if(l != landIdx) {
                    maxScore = Math.max(maxScore, land[x-1][l]);
                }
            }
            land[x][landIdx++] += maxScore;
            
            if(landIdx == landLen) {
                landIdx = 0;
                x++;
            }
        }
        
        for(int i = 0; i < landLen; i++) {
            answer = Math.max(answer, land[land.length-1][i]);
        }

        return answer;
    }
}