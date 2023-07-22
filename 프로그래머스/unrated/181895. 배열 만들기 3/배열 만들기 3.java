import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] section1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] section2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        int section1Len = section1.length;
        int section2Len = section2.length;
        
        int[] answer = new int[section1Len+section2Len];
        
        System.arraycopy(section1, 0, answer, 0, section1Len);
        System.arraycopy(section2, 0, answer, section1Len, section2Len);
        return answer;
    }
}