import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(n != 1) {
            result.add(n);
            if(n % 2 == 0) {
                n /= 2;
            }
            else if(n % 2 != 0) {
                n = 3*n+1;
            }
        }
        result.add(1);
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}