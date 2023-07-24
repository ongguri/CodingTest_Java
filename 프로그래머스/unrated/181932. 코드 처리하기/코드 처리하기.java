class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder ret = new StringBuilder();
        
        int mode = 0;
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = 1 - mode;
            }
            else if(i % 2 == mode) {
                ret.append(code.charAt(i));
            }
        }
        
        if(ret.toString().equals("")) {
            answer = "EMPTY";
        }
        else {
            answer = ret.toString();
        }
        return answer;
    }
}