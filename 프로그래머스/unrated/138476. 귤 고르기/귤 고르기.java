import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int[] fruitSize = new int[10000000];
        for(int tan : tangerine) {
            fruitSize[tan-1]++;
        }
        Arrays.sort(fruitSize);
        
        int fruitCount = 0;
        for(int i = fruitSize.length-1; i >= 0; i--) {
            answer++;
            if(fruitCount + fruitSize[i] < k) {
                fruitCount += fruitSize[i];
                continue;
            }
            break;
        }
        
        return answer;
    }
}