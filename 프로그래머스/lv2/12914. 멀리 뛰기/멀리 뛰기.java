import java.util.ArrayList;

class Solution {
    public long solution(int n) {
        ArrayList<Integer> caseCount = new ArrayList<Integer>();
        caseCount.add(1);
        caseCount.add(2);
        
        for(int i = 2; i < n; i++) {
            caseCount.add((caseCount.get(i-2) + caseCount.get(i-1)) % 1234567);
        }

        return caseCount.get(n-1) % 1234567;
    }
}