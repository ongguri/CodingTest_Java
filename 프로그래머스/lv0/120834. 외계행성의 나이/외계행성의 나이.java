class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = Integer.toString(age);
        
        for(int i = 0; i < strAge.length(); i++) {
            char num = (char)(strAge.charAt(i) - 48 + 97);
            answer += num;
        }
        return answer;
    }
}