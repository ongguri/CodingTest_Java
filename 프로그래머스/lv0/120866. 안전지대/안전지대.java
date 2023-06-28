import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int[] y = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] x = {0, 1, 1, 1, 0, -1, -1, -1};
        
        int n = board.length;
        int answer = n*n;
        
        int[][] danger = new int[n][];
        for(int i = 0; i < n; i++) {
            danger[i] = board[i].clone();
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    danger[i][j] = 1;
                    answer -= 1;
                    int cy = i;
                    int cx = j;
                    for(int loc = 0; loc < 8; loc++) {
                        int ny = cy + y[loc];
                        int nx = cx + x[loc];
                        if(ny < 0 || ny >= n || nx < 0 || nx >= n || danger[ny][nx] == 1) {
                            continue;
                        }
                        danger[ny][nx] = 1;
                        answer -= 1;
                    }
                }
            }
        }
        return answer;
    }
}