class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int r = 0; r < arr1.length; r++) {
            for(int i = 0; i < arr1[0].length; i++) {
                for(int j = 0; j < arr2[0].length; j++) {
                    answer[r][j] += arr1[r][i]*arr2[i][j];
                }
            }
        }
        return answer;
    }
}