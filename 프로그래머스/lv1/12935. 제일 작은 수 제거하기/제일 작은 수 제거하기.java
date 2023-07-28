import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int minNum = Arrays.stream(arr).min().getAsInt();
        
        int[] answer = new int[arr.length-1];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != minNum) {
                answer[idx++] = arr[i];
            }
        }
        
        return (answer.length != 0) ? answer : new int[]{-1};
    }
}