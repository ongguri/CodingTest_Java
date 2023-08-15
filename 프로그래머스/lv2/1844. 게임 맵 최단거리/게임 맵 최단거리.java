import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        int[][] visited = new int[n][m];
        Queue<int[]> mapsQueue = new LinkedList<int[]>();
        
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        mapsQueue.add(new int[]{0, 0});
        visited[0][0] = 1;

        while(!mapsQueue.isEmpty()) {
            int[] cur_node = mapsQueue.poll();

            int cx = cur_node[0];
            int cy = cur_node[1];

            if(cx == n-1 && cy == m-1) { return visited[cx][cy]; }

            for(int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                if(nx >= 0 && ny >= 0 && nx < n && ny < m && visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    mapsQueue.add(new int[]{nx, ny});
                    visited[nx][ny] = visited[cx][cy] + 1;
                }
            }
        }

        return -1;
    }
}