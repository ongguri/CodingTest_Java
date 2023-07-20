import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        int count = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                result.add(count);
                count = 0;
                continue;
            }
            count++;
        }
        
        if(myString.charAt(myString.length() - 1) == 'x' || count != 0) {
            result.add(count);
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}