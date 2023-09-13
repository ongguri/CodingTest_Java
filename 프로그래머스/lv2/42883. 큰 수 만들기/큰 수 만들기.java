import java.util.ArrayList;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Character> numChar = new ArrayList<Character>();
        
        int removeCount = k;
        for(int i = 0; i < number.length(); i++) {
            while(removeCount > 0 && numChar.size() > 0 && numChar.get(numChar.size()-1) < number.charAt(i)) {
                numChar.remove(numChar.size()-1);
                removeCount--;
            }
            numChar.add(number.charAt(i));
        }
        // System.out.println(numChar);
        
        for(int i = 0; i < number.length()-k; i++) {
            answer.append(numChar.get(i));
        }
        
        return answer.toString();
    }
}