class Solution {
    public boolean solution(int x) {
        int sumX = 0, div = x;
        
        while (x / 10 != 0) {
            sumX += x % 10;
            x /= 10;
        }
        sumX += x % 10;
        
        return (div % sumX == 0) ? true : false;
    }
}