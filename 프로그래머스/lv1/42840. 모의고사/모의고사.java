import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] studentScore = {studentScoring(answers, student1), 
                              studentScoring(answers, student2), 
                              studentScoring(answers, student3)};
    
        // 첫번째 방법
        // int maxScore = Math.max(studentScore[0], Math.max(studentScore[1], studentScore[2]));
        
        // 두번째 방법
        int maxScore = Arrays.stream(studentScore).max().getAsInt();
        
        ArrayList<Integer> studentResult = new ArrayList<Integer>();
        for(int s = 0; s < 3; s++) {
            if(studentScore[s] == maxScore) {
                studentResult.add(s+1);
            }
        }
        
        int[] answer = new int[studentResult.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = studentResult.get(i);
        }
        return answer;
    }
    
    public int studentScoring(int[] answers, int[] student) {
        int result = 0;
        int studentNumLoopLen = student.length;
        
        for(int num = 0; num < answers.length; num++) {
            if(answers[num] == student[num % studentNumLoopLen]) {
                result++;
            }
        }
        
        return result;
    }
}