import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> tileList = new ArrayList<Integer>();
        tileList.add(1);
        tileList.add(2);
        
        for(int i = 2; i < n; i++) {
            int num1 = tileList.get(i-2);
            int num2 = tileList.get(i-1);
            tileList.add((num1+num2) % 1000000007);
        }
        
        return tileList.get(n-1);
    }
}