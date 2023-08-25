import java.util.ArrayList;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        long[] factorialArr = new long[n];
        ArrayList<Integer> line = new ArrayList<Integer>();

        long fac = 1;
        for(int i = 1; i <= n; i++) {
            line.add(i);
            fac *= i;
            factorialArr[i-1] = fac;
        }

        int idx = 0;
        while(n >= 1) {
            long changeNum = factorialArr[n - 1] / n;  // changeNum 마다 맨 앞자리가 바뀜.

            long curDepth = k / changeNum;
            if(k % changeNum == 0) {
                k = changeNum;
                curDepth--;
            }
            else {
                k = k % changeNum;
            }
            answer[idx++] = line.get((int)curDepth);
            line.remove((int)curDepth);

            n--;
        }

        return answer;
    }
}