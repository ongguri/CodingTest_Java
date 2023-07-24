class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int idx = 0;
        for(int q = 0; q < queries.length; q++) {
            answer[q] = 1000001;
            for(int i = queries[q][0]; i <= queries[q][1]; i++) {
                if(arr[i] > queries[q][2]) {
                    answer[q] = Math.min(answer[q], arr[i]);
                }
            }
            if(answer[q] == 1000001) {
                answer[q] = -1;
            }
        }
        return answer;
    }
}