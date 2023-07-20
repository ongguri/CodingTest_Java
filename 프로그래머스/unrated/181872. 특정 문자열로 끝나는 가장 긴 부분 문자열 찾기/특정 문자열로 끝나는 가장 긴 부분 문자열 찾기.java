class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int strEnd = 0;
        
        for(int i = 0; i <= myString.length()-pat.length(); i++) {
            if(myString.substring(i, i+pat.length()).equals(pat)) {
                strEnd = i+pat.length();
            }
        }
        answer = myString.substring(0, strEnd);
        return answer;
    }
}