import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        int[] choiceScore = {0, 3, 2, 1, 0, 1, 2, 3};
        HashMap<Character, Integer> personalityType = new HashMap<Character, Integer>() {{
            put('R', 0);
            put('T', 0);
            put('C', 0);
            put('F', 0);
            put('J', 0);
            put('M', 0);
            put('A', 0);
            put('N', 0);
        }};
        
        for(int s = 0; s < survey.length; s++) {
            int choiceNum = choices[s];
            int ch = 0;
            if(choiceNum < 4) { ch = 0; }
            else if(choiceNum > 4) { ch = 1; }
            
            personalityType.put(survey[s].charAt(ch), 
                                    personalityType.get(survey[s].charAt(ch)) + choiceScore[choiceNum]);
        }
        // System.out.println(personalityType);
        
        String[] typeArr = {"RT", "CF", "JM", "AN"};
        for(String type : typeArr) {
            char type1 = type.charAt(0);
            char type2 = type.charAt(1);
            
            if(personalityType.get(type1) >= personalityType.get(type2)) {
                answer.append(type1);
            }
            else if(personalityType.get(type1) < personalityType.get(type2)) {
                answer.append(type2);
            }
        }
        
        return answer.toString();
    }
}