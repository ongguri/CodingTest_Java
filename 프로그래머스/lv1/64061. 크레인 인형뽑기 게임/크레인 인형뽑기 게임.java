import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<Integer> basket = new ArrayList<Integer>();
        basket.add(-1); // dummy
        
        for(int move : moves) {
            for(int y = 0; y < board[0].length; y++) {
                if(board[y][move-1] != 0) {
                    if(basket.get(basket.size()-1) == board[y][move-1]) {
                        basket.remove(basket.size()-1);
                        answer += 2;
                    }
                    else { 
                        basket.add(board[y][move-1]);
                    }
                    board[y][move-1] = 0;
                    break;
                }
            }
        }
        // System.out.println(basket);
        
        return answer;
    }
}