class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
            
        for(int num = i; num <= j; num++) {
            String numStr = Integer.toString(num);
            for(int s = 0; s < numStr.length(); s++) {
                if(numStr.charAt(s)-'0' == k) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
