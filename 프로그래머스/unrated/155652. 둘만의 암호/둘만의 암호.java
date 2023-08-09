class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            int idxCount = 0;
            char ch = s.charAt(i);
            while(idxCount < index) {
                ch = (char)((ch+1 - 'a') % 26 + 'a');
                if(skip.indexOf(ch) != -1) {
                    continue;
                }
                idxCount++;
            }
            answer.append(ch);
        }
        
        return answer.toString();
    }
}