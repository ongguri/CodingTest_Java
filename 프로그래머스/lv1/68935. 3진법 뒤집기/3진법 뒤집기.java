class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder nStrBuilder = new StringBuilder();
        
        while(n / 3 != 0) {
            nStrBuilder.append(n % 3);
            n /= 3;
        }
        nStrBuilder.append(n);
        
        String nStr = nStrBuilder.toString();
        int pow = 0;
        for(int i = nStr.length()-1; i >= 0; i--) {
            answer += (int)Math.pow(3, pow++) * (nStr.charAt(i) - '0');
        }
        
        return answer;
    }
}