class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        
        String hidden = "*";
        int phoneLen = phone_number.length();
        answer.append(hidden.repeat(phoneLen-4));
        answer.append(phone_number.substring(phoneLen-4, phoneLen));
        
        return answer.toString();
    }
}