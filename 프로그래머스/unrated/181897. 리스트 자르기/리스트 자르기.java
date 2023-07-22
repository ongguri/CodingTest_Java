class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 0, end = num_list.length-1, step = 1;
        
        if(n == 1) {
            end = slicer[1];
        }
        else if(n == 2) {
            start = slicer[0];
        }
        else if(n == 3 || n == 4) {
            if(n == 4) {
                step = slicer[2];
            }
            start = slicer[0];
            end = slicer[1];
        }
        
        int[] answer = new int[(end - start + step) / step];
        int idx = 0;
        for(int i = start; i <= end; i += step) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}