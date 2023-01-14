class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 500000) {
            answer = (int)((float)price * (1 - 0.2));
        }
        else if(price >= 300000) {
            answer = (int)((float)price * (1 - 0.1));
        }
        else if(price >= 100000) {
            answer = (int)((float)price * (1 - 0.05));
        }
        else {
            answer = price;
        }
        return answer;
    }
}