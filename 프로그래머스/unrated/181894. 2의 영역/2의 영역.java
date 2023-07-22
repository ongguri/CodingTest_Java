import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int[] position = {-1, -1};
        
        for(int i = 0; i < arr.length; i++) {
            if(position[0] == -1 && arr[i] == 2) {
                position[0] = i;
                position[1] = i;
            }
            else if(position[0] != -1 && arr[i] == 2) {
                position[1] = i;
            }
        }
        
        if(position[0] != -1 && position[1] != -1) {
            answer = Arrays.copyOfRange(arr, position[0], position[1]+1);
        }
        return answer;
    }
}