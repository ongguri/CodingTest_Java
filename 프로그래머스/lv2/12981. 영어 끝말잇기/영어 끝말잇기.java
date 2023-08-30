import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
        
        char prevWord = words[0].charAt(0);
        for(int i = 0; i < words.length; i++) {
            if(wordsMap.get(words[i]) != null || words[i].charAt(0) != prevWord) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            wordsMap.put(words[i], 0);
            prevWord = words[i].charAt(words[i].length()-1);
        }

        return answer;
    }
}