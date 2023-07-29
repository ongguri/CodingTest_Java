class Solution {
    public int solution(int[] nums) {
        int answer = 0, count = 3;
        boolean[] visited = new boolean[nums.length];
        answer = combination(nums, visited, 0, 0, count);
        
        return answer;
    }
    
    public int combination(int[] nums, boolean[] visited, int start, int depth, int count) {
        int sosuCount = 0;
        
        if(depth == count) {
            int sum = 0;
            for(int i = 0; i < nums.length; i++) {
                if(visited[i]) {
                    // System.out.print(nums[i] + " ");
                    sum += nums[i];
                }
            }
            // System.out.println();
            if(isSosu(sum)) {
                return 1;
            }
            return 0;
        }
        
        for(int s = start; s < nums.length; s++) {
            if(!visited[s]) {
                visited[s] = true;
                sosuCount += combination(nums, visited, s + 1, depth + 1, count);
                visited[s] = false;
            }
        }
        
        return sosuCount;
    }
    
    public boolean isSosu(int sum) {
        boolean sosu = true;
        
        for(int i = 2; i <= Math.sqrt(sum); i++) {
            if(sum % i == 0) {
                sosu = false;
                break;
            } 
        }
        
        return sosu;
    }
    
    
}