import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        Set<Integer> arrSet = new LinkedHashSet<Integer>();
        for(int num : arr) {
            arrSet.add(num);
        }
        
        Iterator<Integer> arrIterSet = arrSet.iterator();
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (arrIterSet.hasNext()) ? arrIterSet.next() : -1;
        }
        return answer;
    }
}