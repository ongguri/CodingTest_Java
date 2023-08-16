import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 3, 0, 11));
        
        for(int i = 4; i < n; i++) {
            long num1 = arr.get(i-2);
            long num2 = arr.get(i-4);
            arr.add((int)(((num1*4%1000000007L) - (num2 % 1000000007L) + 1000000007L) % 1000000007L));
        }
    
        return arr.get(n-1);
    }
}