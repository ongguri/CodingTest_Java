import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<List<Integer>> prioritiesInfo = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            prioritiesInfo.add(List.of(priorities[i], i));
        }
        // System.out.println(prioritiesInfo);

        Arrays.sort(priorities);
        int idx = priorities.length-1;
        while(!prioritiesInfo.isEmpty()) {
            List<Integer> curPriority = prioritiesInfo.poll();
            if (curPriority.get(0) != priorities[idx]) {
                prioritiesInfo.add(curPriority);
                continue;
            }
            idx--;
            answer++;
            if(curPriority.get(1) == location) { break; }
        }
        
        return answer;
    }
}