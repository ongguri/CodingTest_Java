class Solution {
    public int[] solution(int[] num_list, int n) {
        int listLen = num_list.length;
        int[] answer = new int[listLen];
        
        int idx = 0;
        for(int i = n; i < listLen+n; i++) {
            answer[idx++] = num_list[i % listLen];
        }
        return answer;
    }
}