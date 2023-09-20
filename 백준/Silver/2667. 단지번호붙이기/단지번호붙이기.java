import java.util.*;

public class Main {
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] map = new int[N][N];

        for(int i = 0; i < N; i++) {
            String line = sc.next();
            for(int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        ArrayList<Integer> answer = solution(map, N);
        Collections.sort(answer);
        System.out.println(answer.size());
        for(int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }

    public static ArrayList<Integer> solution(int[][] map, int N) {
        boolean[][] visited = new boolean[N][N];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    dfs(map, visited, new int[]{i, j});
                    result.add(count);
                    count = 0;
                }
            }
        }

        return result;
    }

    public static void dfs(int[][] map, boolean[][] visited, int[] curLoc) {
        int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int cx = curLoc[0];
        int cy = curLoc[1];
        visited[cx][cy] = true;
        count++;
        for(int[] m : move) {
            int nx = cx + m[0];
            int ny = cy + m[1];
            if(nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length || map[nx][ny] == 0 || visited[nx][ny]) {
                continue;
            }

            visited[nx][ny] = true;
            dfs(map, visited, new int[]{nx, ny});
        }
    }
}