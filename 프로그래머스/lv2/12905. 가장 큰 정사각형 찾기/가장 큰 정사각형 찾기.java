class Solution
{
    public int solution(int [][]board) {
        int answer = 0;
        
        if(board.length == 1 || board[0].length == 1) { return 1; }
        
        for(int x = 1; x < board.length; x++) {
            for(int y = 1; y < board[0].length; y++) {
                if(board[x][y] == 0) { continue; }
                int left = board[x][y-1];
                int up = board[x-1][y];
                int leftUp = board[x-1][y-1];
                
                board[x][y] = Math.min(left, Math.min(up, leftUp)) + 1;
                answer = Math.max(answer, board[x][y]);
            }
        }

        return answer*answer;
    }
}