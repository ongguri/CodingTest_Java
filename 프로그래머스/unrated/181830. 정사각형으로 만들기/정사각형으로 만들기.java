class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        
        int arrRow = arr.length;
        int arrColumn = arr[0].length;
        if(arrRow > arrColumn) {
            answer = new int[arrRow][arrRow];
        }
        else {
            answer  = new int[arrColumn][arrColumn];
        
        }
        
        for(int i = 0; i < arrRow; i++) {
            for(int j = 0; j < arrColumn; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}