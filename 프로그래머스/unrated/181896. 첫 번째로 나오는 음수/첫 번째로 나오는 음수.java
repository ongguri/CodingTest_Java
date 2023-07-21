class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int idx = 0;
        for(int num : num_list) {
            if(num < 0) {
                answer = idx;
                break;
            }
            idx++;
        }
        return answer;
    }
}