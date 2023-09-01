import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> onBridgeTruck = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++) {
            onBridgeTruck.add(0);
        }
        
        int totalWeight = 0;
        int truckIdx = 0;
        while(truckIdx < truck_weights.length) {
            answer++;
            int curWeight = truck_weights[truckIdx];
            totalWeight -= onBridgeTruck.poll();
            
            if(totalWeight+curWeight > weight) {
                onBridgeTruck.add(0);
                continue;
            }
            totalWeight += curWeight;
            onBridgeTruck.add(truck_weights[truckIdx++]);
            // System.out.println(onBridgeTruck);
        }
        
        return answer+bridge_length;
    }
}