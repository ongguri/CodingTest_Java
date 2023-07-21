class Solution {
    public String[] solution(String[] names) {
        int group = 5;
        int groupCount = (names.length % group == 0) ? names.length / group : names.length / group + 1;
        String[] answer = new String[groupCount];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = names[i*group];
        }
        return answer;
    }
}