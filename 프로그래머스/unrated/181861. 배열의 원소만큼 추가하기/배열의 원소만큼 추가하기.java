import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int num : arr) {
            for(int i = 0; i < num; i++) {
                arrList.add(num);
            }
        }
        
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}