import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
        for(String[] c : clothes) {
            clothesMap.put(c[1], clothesMap.getOrDefault(c[1], 0) + 1);
        }
        // System.out.println(clothesMap);
        
        for(String clothesKey : clothesMap.keySet()) {
            answer *= clothesMap.get(clothesKey) + 1;
        }
        
        return answer-1;
    }
}