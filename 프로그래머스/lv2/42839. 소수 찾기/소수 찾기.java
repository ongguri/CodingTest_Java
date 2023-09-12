import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        String[] strNumbers = numbers.split("");
        String[] output = new String[strNumbers.length];
        boolean[] visited = new boolean[strNumbers.length];
        Set<Integer> numSet = new HashSet<Integer>();
        
        for(int i = 1; i <= numbers.length(); i++) {
            permutation(strNumbers, output, visited, 0, i, numSet);
        }
        // System.out.println(numSet);
        
        return numSet.size();
    }
    
    public static void permutation(String[] strNumbers, String[] output, boolean[] visited, int depth, int count, Set<Integer> numSet) {
        if(depth == count) {
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < depth; i++) {
                // System.out.printf("%s ", output[i]);
                str.append(output[i]);
            }
            int num = Integer.parseInt(str.toString());
            if(num == 0 || num == 1) { return; }
            if(isSosu(num)) { numSet.add(num); }
            str.setLength(0);
            
            return;
        }
        
        for(int i = 0; i < strNumbers.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = strNumbers[i];
                permutation(strNumbers, output, visited, depth+1, count, numSet);
                visited[i] = false;
            }
        }
        
        return;
    }
    
    public static boolean isSosu(int num) {
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0 || Math.pow(i, 2) == num) {
                return false;
            }
        }
        
        return true;
    }
}