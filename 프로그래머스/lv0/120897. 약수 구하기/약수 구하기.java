import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numArr = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                numArr.add(i);
            }
        }
        
        int[] answer = new int[numArr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = numArr.get(i);
        }
        
        return answer;
    }
}