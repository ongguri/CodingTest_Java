import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> avgListSort = new ArrayList<Integer>();
        
        for(int[] scr : score) {
            int avg = scr[0]+scr[1];
            avgListSort.add(avg);
        }
        
        List<Integer> avgList = new ArrayList<Integer>(avgListSort);
        avgListSort.sort(Comparator.reverseOrder());
        
        int rank = 0;
        for(int i = 0; i < avgList.size(); i++) {
            int idx = avgList.indexOf(avgListSort.get(i));

            if(i > 0 && (int)avgListSort.get(i-1) == (int)avgListSort.get(i)) {
                answer[idx] = rank;
                avgList.set(idx, -1);
                continue;
            }
            answer[idx] = i+1;
            avgList.set(idx, -1);
            rank = i+1;
        }
        
        return answer;
    }
}