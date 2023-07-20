import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length, len2 = arr2.length;
        
        if(len1 != len2) {
            answer = (len1 > len2) ? 1 : (len1 < len2) ? -1 : 0;
        }
        else if(len1 == len2) {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            
            answer = (sum1 > sum2) ? 1 : (sum1 < sum2) ? -1 : 0;
        }
        
        return answer;
    }
}