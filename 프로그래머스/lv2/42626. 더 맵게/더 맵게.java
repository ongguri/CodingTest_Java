import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityScoville = new PriorityQueue<>();
        for(int sc : scoville) {
            priorityScoville.offer(sc);
        }
        
        while(priorityScoville.size() > 1 && priorityScoville.peek() < K) {
            int food1 = priorityScoville.poll();
            int food2 = priorityScoville.poll();
            priorityScoville.offer(food1 + (food2*2));
            answer++;
        }
        // System.out.println(priorityScoville);
        
        if(priorityScoville.peek() < K) { return -1; }
        
        return answer;
    }
}