class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String str : dic) {
            if(spell.length == str.length()) {
                for(String alpha : spell) {
                    str = str.replaceFirst(alpha, "");
                }
                if(str.equals("")) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}