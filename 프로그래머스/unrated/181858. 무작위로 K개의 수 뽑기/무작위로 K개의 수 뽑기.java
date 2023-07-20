import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int num : arr) {
            if(!arrList.contains(num)) {
                arrList.add(num);
            }
        }
        
        for(int i = 0; i < k; i++) {
            answer[i] = (i < arrList.size()) ? arrList.get(i) : -1;
        }
        
        return answer;
    }
}