class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int num = 0;
        for(int i = 0; i < array.length; i++) {
            if(num < array[i]) {
                num = array[i];
                answer[0] = num;
                answer[1] = i;
            }
        }
        
        return answer;
    }
}