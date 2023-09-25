import java.util.ArrayList;

class Solution {
    public int[] solution(int n, long left, long right) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(long i = left; i <= right; i++) {
            list.add((int)Math.max(i/n+1, i%n+1));
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}