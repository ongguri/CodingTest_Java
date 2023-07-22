import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> indicesMap = new HashMap<Integer, Integer>();
        
        for(int ind : indices) {
            indicesMap.put(ind, 0);
        }
        
        for(int i = 0; i < my_string.length(); i++) {
            if(indicesMap.get(i) == null) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}