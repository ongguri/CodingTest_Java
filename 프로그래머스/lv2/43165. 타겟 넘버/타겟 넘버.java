class Solution {
    
    private static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public static void dfs(int[] numbers, int target, int idx, int sum) {
        if(idx == numbers.length && sum == target) {
            answer++;
            return;
        }
        else if(idx >= numbers.length) { return; }
        
        dfs(numbers, target, idx+1, sum+numbers[idx]);
        dfs(numbers, target, idx+1, sum-numbers[idx]);
    }
}