import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int idx = 0;
        for(int[] command : commands) {
            int[] arrayCopy = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(arrayCopy);
            answer[idx++] = arrayCopy[command[2]-1];
        }
        return answer;
    }
}