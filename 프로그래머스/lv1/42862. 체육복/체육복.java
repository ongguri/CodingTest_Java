import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        HashMap<Integer, Integer> reserveMap = new HashMap<Integer, Integer>();
        for(int reserveStd : reserve) {
            int getClothes = 2;
            for(int lostStd : lost) {
                if(reserveStd == lostStd) {
                    answer++;
                    getClothes = 1;
                    break;
                }
            }
            reserveMap.put(reserveStd, getClothes);
        }
        // System.out.println(reserveMap);
        
        Arrays.sort(lost);
        for(int lostStd : lost) {
            if(reserveMap.get(lostStd) != null) {
                continue;
            }
            
            if(reserveMap.get(lostStd-1) != null && reserveMap.get(lostStd-1) == 2) {
                reserveMap.put(lostStd - 1, reserveMap.get(lostStd-1) - 1);
                answer++;
            }
            else if(reserveMap.get(lostStd+1) != null && reserveMap.get(lostStd+1) == 2) {
                reserveMap.put(lostStd + 1, reserveMap.get(lostStd+1) - 1);
                answer++;
            }
        }
        
        return answer;
    }
}