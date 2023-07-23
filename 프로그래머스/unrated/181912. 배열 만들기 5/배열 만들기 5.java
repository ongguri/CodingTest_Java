import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> intSlice = new ArrayList<Integer>();
        
        for(String numStr : intStrs) {
            int num = Integer.parseInt(numStr.substring(s, s+l));
            if(num > k) {
                intSlice.add(num);
            }
        }
        
        int[] answer = new int[intSlice.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = intSlice.get(i);
        }
        return answer;
    }
}