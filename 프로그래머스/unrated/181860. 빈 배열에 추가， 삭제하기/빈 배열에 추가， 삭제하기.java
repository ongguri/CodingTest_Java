import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                addLoop(arrList, arr[i], arr[i]*2);
            }
            else {
                removeLoop(arrList, arr[i]);
            }
        }
        
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
    
    public void addLoop(ArrayList<Integer> arrList, int arrNum, int count) {
        for(int c = 0; c < count; c++) {
            arrList.add(arrNum);
        }
    }
    
    public void removeLoop(ArrayList<Integer> arrList, int count) {
        for(int c = 0; c < count; c++) {
            arrList.remove(arrList.size() - 1);
        }
    }
}