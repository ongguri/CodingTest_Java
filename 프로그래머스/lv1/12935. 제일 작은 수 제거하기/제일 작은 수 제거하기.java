class Solution {
    public int[] solution(int[] arr) {
        int minNum = arr[0];
        for(int num : arr) {
            minNum = Math.min(minNum, num);
        }
        
        int[] answer = new int[arr.length-1];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != minNum) {
                answer[idx++] = arr[i];
            }
        }
        
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}