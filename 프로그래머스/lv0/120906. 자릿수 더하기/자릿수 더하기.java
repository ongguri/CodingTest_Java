class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = n+"";
        
        for(int s = 0; s < nStr.length(); s++) {
            answer += Integer.valueOf(nStr.charAt(s)-'0');
        }
        return answer;
    }
}