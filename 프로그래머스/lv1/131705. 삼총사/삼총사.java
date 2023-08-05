class Solution {
    public int solution(int[] number) {
        int answer = 0;
        boolean[] visited = new boolean[number.length];
        answer = combination(number, visited, 0, 0, 3);
        return answer;
    }
    
    public static int combination(int[] number, boolean[] visited, int start, int depth, int count) {
        int result = 0;
        
        if(depth == count) {
            int sum = 0;
            for(int i = 0; i < visited.length; i++) {
                if(visited[i]) {
                    sum += number[i];
                }
            }
            if(sum == 0) {
                result++;
            }
            return result;
        }
        
        for(int i = start; i < number.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                result += combination(number, visited, i + 1, depth + 1, count);
                visited[i] = false;
            }
        }
        
        return result;
    }
}