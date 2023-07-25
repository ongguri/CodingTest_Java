class Solution {
    public int solution(int a, int b) {
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        num1.append(a);
        num1.append(b);
        
        num2.append(b);
        num2.append(a);
        
        return Math.max(Integer.parseInt(num1.toString()), Integer.parseInt(num2.toString()));
    }
}