class Solution {
    int solution(int[][] land) {
        int len = land.length-1;
        
        for(int l = 1; l < land.length; l++) {
            land[l][0] += Math.max(land[l-1][1], Math.max(land[l-1][2], land[l-1][3]));
            land[l][1] += Math.max(land[l-1][0], Math.max(land[l-1][2], land[l-1][3]));
            land[l][2] += Math.max(land[l-1][0], Math.max(land[l-1][1], land[l-1][3]));
            land[l][3] += Math.max(land[l-1][0], Math.max(land[l-1][1], land[l-1][2]));
        }

        return Math.max(land[len][0], Math.max(land[len][1], Math.max(land[len][2], land[len][3])));
    }
}