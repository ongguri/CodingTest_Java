import java.util.LinkedHashMap;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] roller = new int[section.length];
        LinkedHashMap<Integer, Integer> sectionMap = new LinkedHashMap<Integer, Integer>();
        for(int sec : section) {
            sectionMap.put(sec, 1);
        }
        // System.out.println(sectionMap);
        
        int sectionIdx = 0;
        for(Integer sec : sectionMap.keySet()) {
            if(sectionMap.get(sec) == 0) {
                continue;
            }
            for(int i = 0; i < m; i++) {
                if(sectionMap.get(sec+i) != null && sectionMap.get(sec+i) == 1) {
                    sectionMap.put(sec+i, sectionMap.get(sec+i)-1);
                }
            }
            answer++;
        }
        return answer;
    }
}