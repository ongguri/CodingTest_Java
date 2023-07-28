import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        // return Arrays.stream(arr).average().getAsDouble();
        
        double answer = 0;
        
        for(int num : arr) {
            answer += num;
        }
        
        return answer / arr.length;
    }
}