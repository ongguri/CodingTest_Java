import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int num : arr) {
            if(num % divisor == 0) {
                arrList.add(num);
            }
        }
        
        if(arrList.size() != 0) {
            Collections.sort(arrList);
            answer = new int[arrList.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = arrList.get(i);
            }
        }
        
        return answer;
    }
}