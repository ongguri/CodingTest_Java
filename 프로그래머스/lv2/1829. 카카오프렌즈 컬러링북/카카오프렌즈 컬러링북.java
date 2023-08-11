import java.util.*;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = {0, 0};
        int[][] visited = new int[m][n];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<Integer[]> graphQueue = new LinkedList<Integer[]>();
        
        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < picture[0].length; j++) {
                if(picture[i][j] == 0) { continue; }  // 색칠된 부분이 아니라면
                if(visited[i][j] == 0) { // 방문하지 않았다면
                    int visiteCount = 0;
                    answer[0]++;
                    graphQueue.add(new Integer[]{i, j});
                    
                    while(graphQueue.size() != 0) {
                        Integer[] cur_node = graphQueue.poll();
                        int cx = cur_node[0];
                        int cy = cur_node[1];
                        
                        for(int d = 0; d < 4; d++) {
                            int nx = cx + dx[d];
                            int ny = cy + dy[d];
                            if(nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length || 
                               picture[nx][ny] != picture[cx][cy] || visited[nx][ny] != 0) {
                                continue;
                            }
                            graphQueue.add(new Integer[]{nx, ny});
                            visited[nx][ny] = 1;
                            visiteCount++;
                        }
                    }
                    answer[1] = Math.max(answer[1], visiteCount);
                }
            }
        }

        return answer;
    }
}