import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(arr[0]);
        
        int arrListLastIdx = arrList.size()-1;
        for(int i = 1; i < arr.length; i++) {
            if(arrList.get(arrListLastIdx) != arr[i]) {
                arrList.add(arr[i]);
                arrListLastIdx++;
            }
        }
        
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}