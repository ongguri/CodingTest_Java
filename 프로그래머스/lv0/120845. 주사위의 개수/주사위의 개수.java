class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        for(int i = 0; i < 3; i++) {
            box[i] -= box[i] % n;
        }
        return answer = (box[0] * box[1] * box[2]) / (n*n*n);
    }
}