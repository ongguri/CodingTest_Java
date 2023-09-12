import java.util.HashMap;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        String[] strNumbers = numbers.split("");
        String[] output = new String[strNumbers.length];
        boolean[] visited = new boolean[strNumbers.length];
        HashMap<Integer, Integer> sosu = new HashMap<>();
        
        for(int i = 1; i <= numbers.length(); i++) {
            permutation(strNumbers, output, visited, 0, i, sosu);
        }
        // System.out.println(sosu);
        
        return sosu.size();
    }
    
    public static void permutation(String[] strNumbers, String[] output, boolean[] visited, int depth, int count, HashMap<Integer, Integer> sosu) {
        if(depth == count) {
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < depth; i++) {
                // System.out.printf("%s ", output[i]);
                str.append(output[i]);
            }
            int num = Integer.parseInt(str.toString());
            if(num == 0 || num == 1) { return; }
            if(sosu.get(num) == null) {
                if(isSosu(num)) { sosu.put(num, 0); }
            }
            // System.out.println();
            str.setLength(0);
            
            return;
        }
        
        for(int i = 0; i < strNumbers.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = strNumbers[i];
                permutation(strNumbers, output, visited, depth+1, count, sosu);
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