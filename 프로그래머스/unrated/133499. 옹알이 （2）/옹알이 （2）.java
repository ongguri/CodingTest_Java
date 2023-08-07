import java.util.HashMap;

class Solution {
    public int solution(String[] babbling) {
        // aya, ye, woo, ma
        int answer = 0;
        StringBuilder wordSb = new StringBuilder();

        HashMap<String, Integer> babblingMap = new HashMap<String, Integer>() {{
            put("aya", 0);
            put("ye", 0);
            put("woo", 0);
            put("ma", 0);
        }};

        for(String babble : babbling) {
            String prevWord = "";
            boolean canSay = true;
            for(int b = 0; b < babble.length(); b++) {
                wordSb.append(babble.charAt(b));

                if(babblingMap.get(wordSb.toString()) != null && !prevWord.equals(wordSb.toString())) {
                    prevWord = wordSb.toString();
                    wordSb.setLength(0);
                }
                else if(wordSb.length() == 3) {
                    canSay = false;
                    break;
                }
            }
            if(wordSb.length() != 0) {
                canSay = false;
                wordSb.setLength(0);
            }

            if(canSay) {
                answer++;
            }
        }

        return answer;
    }
}