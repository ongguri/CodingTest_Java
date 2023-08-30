import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
        
        int num = 0, count = 0;
        char prevWord = words[0].charAt(0);
        for(int i = 0; i < words.length; i++) {
            num = i % n + 1;
            count = i / n + 1;
            if(wordsMap.get(words[i]) != null || words[i].charAt(0) != prevWord) {
                answer[0] = num;
                answer[1] = count;
                break;
            }
            wordsMap.put(words[i], 0);
            prevWord = words[i].charAt(words[i].length()-1);
        }

        return answer;
    }
}