import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> sumSet = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }
        // System.out.println(sumSet);
        
        Iterator<Integer> sumIter = sumSet.iterator();
        int[] answer = new int[sumSet.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = sumIter.next();
        }
        Arrays.sort(answer);
        
        return answer;
    }
}