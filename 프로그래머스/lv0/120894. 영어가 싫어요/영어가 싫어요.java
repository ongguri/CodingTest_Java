import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        String answer = "";
        String num = "";
        HashMap<String, String> alphaNum = new HashMap<String, String>();
        alphaNum.put("zero", "0");
        alphaNum.put("one", "1");
        alphaNum.put("two", "2");
        alphaNum.put("three", "3");
        alphaNum.put("four", "4");
        alphaNum.put("five", "5");
        alphaNum.put("six", "6");
        alphaNum.put("seven", "7");
        alphaNum.put("eight", "8");
        alphaNum.put("nine", "9");
        
        for(int i = 0; i < numbers.length(); i++) {
            num += numbers.charAt(i);
            if(alphaNum.containsKey(num)) {
                answer += alphaNum.get(num);
                num = "";
            }
        }
        
        return Long.parseLong(answer);
    }
}