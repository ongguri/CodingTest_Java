class Solution {
    public int solution(int num, int k) {
        int answer = (num+"").indexOf(k+"");
        return answer == -1 ? -1 : answer+1;
    }
}