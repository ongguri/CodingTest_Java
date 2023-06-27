class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int x_size = (int)board[0]/2;
        int y_size = (int)board[1]/2;
        
        for(String move : keyinput) {
            if (move.equals("left") && x_size*-1 <= answer[0] - 1) {
                answer[0] -= 1;
            }
            else if (move.equals("right") && x_size >= answer[0] + 1) {
                answer[0] += 1;
            }
            else if (move.equals("up") && y_size >= answer[1] + 1) {
                answer[1] += 1;
            }
            else if (move.equals("down") && y_size*-1 <= answer[1] - 1) {
                answer[1] -= 1;
            }
        }
        return answer;
    }
}