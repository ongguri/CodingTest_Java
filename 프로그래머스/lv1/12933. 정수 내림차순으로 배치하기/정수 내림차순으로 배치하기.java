import java.util.Arrays;

class Solution {
    public long solution(long n) {
//         long answer = 0;
//         long[] nIntArr = new long[Long.toString(n).length()];
        
//         for(int i = 0; i < nIntArr.length; i++) {
//             nIntArr[i] = n % 10;
//             n /= 10;
//         }
//         Arrays.sort(nIntArr);
        
//         for(int i = 0; i < nIntArr.length; i++) {
//             answer += Math.pow(10, i) * nIntArr[i];
//         }
//         return answer;
        
        String[] nStrArr = Long.toString(n).split("");
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(nStrArr);
        for(int i = nStrArr.length-1; i >= 0; i--) {
            sb.append(nStrArr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }  // StringBuilder로 해결하면 금방 해결하긴 함.
}