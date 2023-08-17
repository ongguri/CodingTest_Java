class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        for (int x = 1; x < land.length; x++) {
            for (int y = 0; y < land[0].length; y++) {
                int maxScore = 0;
                for (int l = 0; l < land[0].length; l++) {
                    if (y != l) {
                        maxScore = Math.max(maxScore, land[x-1][l]);
                    }
                }
                land[x][y] += maxScore;
            }
        }
        
        for(int score : land[land.length-1]) {
            answer = Math.max(answer, score);
        }

        return answer;
    }
}