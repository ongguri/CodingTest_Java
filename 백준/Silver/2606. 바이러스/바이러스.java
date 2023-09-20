import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int computer = sc.nextInt();
        int connect = sc.nextInt();

        for(int i = 0; i < computer; i++) {
            map.put(i+1, new ArrayList<>());
        }

        for(int i = 1; i <= connect; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            map.get(node1).add(node2);
            map.get(node2).add(node1);
        }

        int answer = solution(map);
        System.out.println(answer);
    }

    public static int solution(HashMap<Integer, ArrayList<Integer>> map) {
        int answer = 0;
        boolean[] visited = new boolean[map.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int curNode = queue.poll();
            for(int nextNode : map.get(curNode)) {
                if(!visited[nextNode-1]) {
                    visited[nextNode-1] = true;
                    queue.add(nextNode);
                }
            }
        }

        for(int i = 0; i < visited.length; i++) {
            if(visited[i]) { answer++; }
        }

        return answer-1;
    }
}