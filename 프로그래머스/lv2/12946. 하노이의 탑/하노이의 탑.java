import java.util.ArrayList;

class Solution {
    private static ArrayList<int[]> result;
    
    public int[][] solution(int n) {
        result = new ArrayList<int[]>();
        dfs(n, 1, 3, 2);


        int[][] answer = new int[result.size()][n];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
    
    private static void dfs(int n, int start, int to, int mid) {
        if(n == 1){
            result.add(new int[]{start, to});
            return;
        }
        dfs(n-1, start, mid, to);

        result.add(new int[]{start, to});
        
        dfs(n-1, mid, to, start);
    }
}