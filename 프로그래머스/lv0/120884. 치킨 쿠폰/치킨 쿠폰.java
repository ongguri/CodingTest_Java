class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken/10 != 0) {
            int coupon = 0;
            answer += chicken / 10;
            coupon += chicken % 10;
            chicken /= 10;
            chicken += coupon;
            
        }
        return answer;
    }
}