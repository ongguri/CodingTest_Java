import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            map.put(i, new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            map.get(node1).add(node2);
            map.get(node2).add(node1);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(map.get(i));
        }
        
        boolean[] visited = new boolean[N];
        dfs(map, visited, V);
        System.out.println();
        visited = new boolean[N];
        bfs(map, visited, V);
        
        
	}
    
    public static void dfs(HashMap<Integer, ArrayList<Integer>> map, boolean[] visited, int curNode) {

        visited[curNode-1] = true;
        System.out.printf("%d ", curNode);

        for(int node : map.get(curNode)) {
            if(!visited[node-1]) {
                dfs(map, visited, node);
            }
        }
    }
    
    public static void bfs(HashMap<Integer, ArrayList<Integer>> map, boolean[] visited, int start) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start-1] = true;
        while(!queue.isEmpty()) {
            int curNode = queue.poll();
            System.out.printf("%d ", curNode);
            for(int node : map.get(curNode)) {
                if(!visited[node-1]) {
                    queue.add(node);
                    visited[node-1] = true;
                }
            }
        }
    }
}