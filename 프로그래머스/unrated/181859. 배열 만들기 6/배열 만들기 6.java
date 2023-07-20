import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(arrList.isEmpty() || !arrList.isEmpty() && arrList.get(arrList.size() - 1) != arr[i]) {
                arrList.add(arr[i]);
            }
            else if(!arrList.isEmpty() && arrList.get(arrList.size() - 1) == arr[i]) {
                arrList.remove(arrList.size()-1);
            }
        }

        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrList.get(i);
        }
        
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}