class Solution {
    public int[] solution(int[] num_list, int n) {
        int num_list_len = num_list.length;
        int[] answer = new int[(num_list_len % n == 0) ? num_list_len / n : num_list_len / n + 1];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i*n];
        }
        return answer;
    }
}