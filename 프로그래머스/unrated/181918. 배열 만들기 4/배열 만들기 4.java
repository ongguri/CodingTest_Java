import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> stack = new ArrayList<Integer>();
        
        int idx = 0;
        while(idx < arr.length) {
            if(stack.isEmpty() || stack.get(stack.size()-1) < arr[idx]) {
                stack.add(arr[idx]);
                idx++;
            }
            else if(stack.get(stack.size()-1) >= arr[idx]) {
                stack.remove(stack.size()-1);
            }
        }
        
        int[] stk = new int[stack.size()];
        for(int i = 0; i < stk.length; i++) {
            stk[i] = stack.get(i);
        }
        
        return stk;
    }
}