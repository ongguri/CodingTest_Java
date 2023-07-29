class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder ret = new StringBuilder();

        boolean mode = false;
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') { mode = !mode; }
            else if(!mode && i % 2 == 0) { ret.append(code.charAt(i)); }
            else if(mode && i % 2 != 0) { ret.append(code.charAt(i)); }
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