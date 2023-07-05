import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        for(int side : sides) {
            answer += side;
            if(max <= side) { max = side; }
        }
        return (answer - max > max) ? 1 : 2;
    }
}