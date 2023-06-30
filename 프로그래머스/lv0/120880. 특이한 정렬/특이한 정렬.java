import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Integer> distance = new ArrayList<Integer>(Arrays.asList());
        Arrays.sort(numlist);
        
        for(int num : numlist) {
            distance.add(Math.abs(num-n));
        }
        
        int pnt = 0;
        while(pnt != numlist.length) {
            int minNum = Collections.min(distance);
            for(int i = numlist.length-1; i >= 0; i--) {
                if(minNum == distance.get(i)) {
                    distance.set(i, 10001);
                    answer[pnt] = numlist[i];
                    pnt++;
                }
            }
        }
        return answer;
    }
}