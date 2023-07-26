import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> ponKeMon = new HashSet<Integer>();
        for(int num : nums) {
            ponKeMon.add(num);
        }

        return Math.min(ponKeMon.size(), nums.length / 2);
    }
}