class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int[][] move = {{1, 0}, {0, 1}, {-1, -1}};
        int moveIdx = 0;
        
        int cx = 0;
        int cy = 0;
        int num = 2;
        triangle[cx][cy] = 1;
        while(moveIdx < n) {
            int nx = cx + move[moveIdx%3][0];
            int ny = cy + move[moveIdx%3][1];
            
            if(nx < 0 || nx >= n || ny < 0 || ny >= n || triangle[nx][ny] != 0) {
                moveIdx++;
                continue;
            }
            
            triangle[nx][ny] = num++;
            cx = nx;
            cy = ny;
        }
        
        int[] answer = new int[num-1];
        int answerIdx = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                answer[answerIdx++] = triangle[i][j];
            }
        }
        
        return answer;
    }
}