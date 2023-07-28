import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Long> nArr = new ArrayList<Long>();
        
        while(n / 10 != 0) {
            nArr.add(n % 10);
            n /= 10;
        }
        nArr.add(n);
        
        int[] answer = new int[nArr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = nArr.get(i).intValue();
        }
        
        return answer;
    }
}