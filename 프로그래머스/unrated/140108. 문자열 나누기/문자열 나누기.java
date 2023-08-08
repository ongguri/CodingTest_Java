class Solution {
    public int solution(String s) {
        int answer = 0;
        int equalStr = 0;
        char comparisonStr = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++) {
            
            equalStr = (comparisonStr == s.charAt(i)) ? equalStr+1 : equalStr-1;
            
            if(equalStr == 0 && i+1 < s.length()) {
                answer++;
                comparisonStr = s.charAt(i+1);
            }
        }
        
        return answer+1;  // 마지막 연산은 서로 개수가 같거나 달라도 하나의 덩어리.
    }
}