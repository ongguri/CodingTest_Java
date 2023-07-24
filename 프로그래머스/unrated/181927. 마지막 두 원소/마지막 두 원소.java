class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int num_list_len = num_list.length;
        
        System.arraycopy(num_list, 0, answer, 0, num_list_len);
        
        int last1 = answer[num_list_len-1];
        int last2 = answer[num_list_len-2];
        if(last1 > last2) {
            answer[num_list_len] = last1 - last2;
        }
        else if(last1 <= last2) {
            answer[num_list_len] = last1 * 2;
        }
        
        return answer;
    }
}