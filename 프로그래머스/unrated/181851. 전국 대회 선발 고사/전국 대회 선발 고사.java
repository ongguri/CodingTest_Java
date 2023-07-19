import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int calc = 10000, count = 0;
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < rank.length; i++) {
            if(!attendance[i]) {
                rankMap.put(rank[i], -1);
                continue;
            }
            rankMap.put(rank[i], i);
        }
        
        for(int r = 0; r < rank.length; r++) {
            if(rankMap.get(r+1) != -1) {
                answer += calc*rankMap.get(r+1);
                calc /= 100;
                count++;
            }
            if(count == 3) { break; }
        }
        return answer;
    }
}