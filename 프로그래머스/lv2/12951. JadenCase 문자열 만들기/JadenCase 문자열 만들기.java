class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.toLowerCase().split("");
        boolean blank = true;
        
        for(String str : strArr) {
            answer.append((blank) ? str.toUpperCase() : str);
            blank = str.equals(" ");
        }
        
        return answer.toString();
    }
}