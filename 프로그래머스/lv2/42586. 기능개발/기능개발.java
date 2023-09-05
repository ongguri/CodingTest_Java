import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> deployList = new ArrayList<Integer>();
        
        int day = 0;
        int deploy = 1;
        for(int i = 0; i < progresses.length; i++) {
            int completeDay = 0;
            while(progresses[i] < 100) {
                completeDay++;
                progresses[i] += speeds[i];
            }
            
            if(day < completeDay) {
                deployList.add(deploy);
                deploy = 1;
                day = completeDay;
            }
            else if(day >= completeDay) { deploy++; }
        }
        deployList.add(deploy);
        // System.out.println(deployList);
        
        int[] answer = new int[deployList.size()-1];
        for(int i = 1; i <= answer.length; i++) {
            answer[i-1] = deployList.get(i);
        }
        
        return answer;
    }
}