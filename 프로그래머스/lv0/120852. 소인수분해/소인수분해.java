import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int n) {
        HashSet<Integer> numList = new HashSet<Integer>();
        int num = 2;
        while(n != 1) {
            if(n % num == 0) {
                numList.add(num);
                n /= num;
            }
            else {
                num++;
            }
        }
        ArrayList<Integer> answer = new ArrayList<>(numList);
        Collections.sort(answer);
        return answer;
    }
}