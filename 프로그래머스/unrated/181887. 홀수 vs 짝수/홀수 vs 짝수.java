class Solution {
    public int solution(int[] num_list) {
        int odd = 0, even = 0;
        
        boolean isOdd = true;
        for(int num : num_list) {
            if(isOdd) {
                odd += num;
            }
            else {
                even += num;
            }
            isOdd = !isOdd;
        }
        
        return (odd > even) ? odd : even;
    }
}