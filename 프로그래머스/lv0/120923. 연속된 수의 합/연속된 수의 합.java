class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum;
        int start = -num/2;
        
        do {
            sum = 0;
            int add = start;
            for(int i = 0; i < num; i++) {
                answer[i] = add;
                sum += add++;
            }
            start++;
        } while(sum != total);
        
        return answer;
    }
}