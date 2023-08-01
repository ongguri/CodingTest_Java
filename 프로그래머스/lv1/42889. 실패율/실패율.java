import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        LinkedHashMap<Integer, Integer> stageMap = new LinkedHashMap<Integer, Integer>();
        for(int i = 1; i <= N; i++) {
            stageMap.put(i, 0);
        }
        for(int stage : stages) {
            stageMap.put(stage, stageMap.getOrDefault(stage, 0) + 1);
        }
        // System.out.println(stageMap);
        
        int clearUserCount = stages.length;
        HashMap<Integer, Double> failRateMap = new HashMap<Integer, Double>();
        for(int i = 1; i <= N; i++) {
            if(clearUserCount != 0) {
                failRateMap.put(i, (double)stageMap.get(i) / clearUserCount);
            }
            else {
                failRateMap.put(i, 0.0);
            }
            clearUserCount -= stageMap.get(i);
        }
        // System.out.println(failRateMap);
        
        ArrayList<Integer> keys = new ArrayList<Integer>(failRateMap.keySet());
        Collections.sort(keys, (v1, v2) 
                         -> (failRateMap.get(v2).compareTo(failRateMap.get(v1))));
        
        int idx = 0;
        for (int key : keys) {
            answer[idx++] = key;
        }
        
        return answer;
    }
}