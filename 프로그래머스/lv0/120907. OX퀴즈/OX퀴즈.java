class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        
        for(String eval : quiz) {
            String[] quizArr = eval.split(" ");
            int result = Integer.parseInt(quizArr[0]);
            
            for(int i = 1; i < quizArr.length-2; i += 2) {
                if(quizArr[i].equals("+")) {
                    result += Integer.parseInt(quizArr[i+1]);
                }
                else if(quizArr[i].equals("-")) {
                    result -= Integer.parseInt(quizArr[i+1]);
                }
            }
            
            answer[idx] = (result == Integer.parseInt(quizArr[quizArr.length-1])) ? "O" : "X";
            idx++;
        }
        
        return answer;
    }
}