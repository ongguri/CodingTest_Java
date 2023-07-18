class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[][] dist = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] pos = {0, 0};
        int d = 0;
        
        answer[0][0] = 1;
        int i = 2;
        while(i <= n*n) {

            pos[0] += dist[d % 4][0];
            pos[1] += dist[d % 4][1];
            if(pos[0] < 0 || pos[0] >= n || pos[1] < 0 || pos[1] >= n || answer[pos[0]][pos[1]] != 0) {
                pos[0] += dist[(d+2) % 4][0];
                pos[1] += dist[(d+2) % 4][1];
                d++;
                continue;
            }
            answer[pos[0]][pos[1]] = i;
            i++;
        }
        return answer;
    }
}