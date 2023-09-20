import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] maze = new int[N][M];

        for(int i = 0; i < N; i++) {
            String line = sc.next();
            for(int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        int answer = solution(maze, N, M);
        System.out.println(answer);
    }

    public static int solution(int[][] maze, int N, int M) {
        int[][] visited = new int[N][M];
        int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();

        visited[0][0] = 1;
        queue.add(new int[]{0, 0});
        while(!queue.isEmpty()) {
            int[] curLoc = queue.poll();
            int cx = curLoc[0];
            int cy = curLoc[1];
            if(cx == N && cy == M) { return visited[cx][cy]; }

            for(int i = 0; i < 4; i++) {
                int nx = cx + move[i][0];
                int ny = cy + move[i][1];

                if(nx < 0 || nx >= N || ny < 0 || ny >= M || maze[nx][ny] == 0 || visited[nx][ny] != 0) {
                    continue;
                }
                visited[nx][ny] = visited[cx][cy] + 1;
                queue.add(new int[]{nx, ny});
            }
        }

        return visited[N-1][M-1];
    }
}