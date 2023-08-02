import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] score = {6, 6, 5, 4, 3, 2, 1};
        int matchCount = 0, zeroCount = 0;
        
        HashSet<Integer> win_num_set = new HashSet<Integer>();
        for(int win_num : win_nums) {
            win_num_set.add(win_num);
        }
        
        for(int lotto : lottos) {
            if(win_num_set.contains(lotto)) {
                matchCount++;
            }
            else if(lotto == 0) {
                zeroCount++;
            }
        }
        answer[0] = score[matchCount+zeroCount];
        answer[1] = score[matchCount];
        
        return answer;
    }
}