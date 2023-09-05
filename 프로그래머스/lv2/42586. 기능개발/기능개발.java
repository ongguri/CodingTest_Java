import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> completeDay = new LinkedList<Integer>();
        LinkedList<Integer> result = new LinkedList<Integer>();
        
        for(int i = 0; i < progresses.length; i++) {
            int day = 0;
            while(progresses[i] < 100) {
                day++;
                progresses[i] += speeds[i];
            }
            completeDay.add(day);
        }
        // System.out.println(completeDay);
        
        while(!completeDay.isEmpty()) {
            int curDay = completeDay.poll();
            int count = 1;
            while(!completeDay.isEmpty() && completeDay.peek() <= curDay) {
                completeDay.poll();
                count++;
            }
            result.add(count);
        }
        // System.out.println(result);
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}