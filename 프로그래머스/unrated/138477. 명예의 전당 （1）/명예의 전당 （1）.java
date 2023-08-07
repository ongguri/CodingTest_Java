import java.util.LinkedList;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int day = 0;
        
        LinkedList<Integer> rank = new LinkedList<Integer>();
        rank.add(score[0]);
        answer[day++] = score[0];
        
        for(int i = 1; i < score.length; i++) {
            boolean isMin = true;
            for(int j = 0; j < rank.size(); j++) {
                if(score[i] >= rank.get(j)) {
                    rank.add(j, score[i]);
                    isMin = false;
                    break;
                }
                else if(j > k) { break; }
            }
            if(isMin) { rank.add(score[i]); }
            
            if(rank.size() < k) {
                answer[day++] = rank.get(rank.size()-1);
            }
            else {
                answer[day++] = rank.get(k-1);
            }
        }
        return answer;
    }
}