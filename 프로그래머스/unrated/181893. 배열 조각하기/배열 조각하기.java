import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr.clone();
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                // 0 ~ query[i]+1
                answer = Arrays.copyOfRange(answer, 0, query[i]+1);
            }
            else if(i % 2 != 0) {
                // query[i] ~ answer.length
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        return answer;
    }
}