class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        int div = 2;
        while(div <= b) {
            if(a%div == 0 && b%div == 0) {
                a /= div;
                b /= div;
                continue;
            }
            div++;
        }
        
        div = 2;
        while(div <= b) {
            if(b%div == 0) {
                if(div != 2 && div != 5) {
                    answer = 2;
                    break;
                }
                b /= div;
                continue;
            }
            div++;
        }
        
        return answer;
    }
}