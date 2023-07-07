import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> nList = new ArrayList<Integer>();
        for(int num : numlist) {
            if(num % n == 0) {
                nList.add(num);
            }
        }
        
        int[] answer = new int[nList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = nList.get(i);
        }
        return answer;
    }
}