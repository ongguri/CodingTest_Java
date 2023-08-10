import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> yearningMap = new HashMap<String, Integer>();
        for(int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        // System.out.println(yearningMap);
        
        int answerIdx = 0;
        for(int p = 0; p < photo.length; p++) {
            for(String n : photo[p]) {
                if(yearningMap.get(n) != null) {
                    answer[answerIdx] += yearningMap.get(n);
                }
            }
            answerIdx++;
        }
        
        return answer;
    }
}