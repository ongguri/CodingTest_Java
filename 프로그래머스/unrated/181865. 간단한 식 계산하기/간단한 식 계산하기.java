class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bino = binomial.split(" ");
        int num1 = Integer.parseInt(bino[0]), num2 = Integer.parseInt(bino[2]);
        if(bino[1].equals("+")) { answer = num1 + num2; }
        else if(bino[1].equals("-")) { answer = num1 - num2; }
        else if(bino[1].equals("*")) { answer = num1 * num2; }
        return answer;
    }
}