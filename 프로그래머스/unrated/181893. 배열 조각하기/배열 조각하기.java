import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int pl = 0, pr = 0;
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                pr = pl + query[i];
            }
            else if(i % 2 != 0) {
                pl += query[i];
            }
        }
        return Arrays.copyOfRange(arr, pl, pr+1);
    }
}