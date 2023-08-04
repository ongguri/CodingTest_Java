import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // <유저, 신고 유저>
        HashMap<String, ArrayList<String>> reportUser = new HashMap<>();
        // <신고받은 유저, 횟수>
        HashMap<String, Integer> reportCount = new HashMap<String, Integer>();
        
        for(String reportStr : report) {
            String[] userAndReportedUser = reportStr.split(" ");
            if(reportUser.get(userAndReportedUser[0]) == null) {
                reportUser.put(userAndReportedUser[0], 
                               new ArrayList<>(Arrays.asList(userAndReportedUser[1])));
            }
            else if(reportUser.get(userAndReportedUser[0]) != null) {
                // 해당 유저가 이미 신고했던 회원이라면.
                if(reportUser.get(userAndReportedUser[0]).contains(userAndReportedUser[1])) {
                    continue;
                }
                reportUser.get(userAndReportedUser[0]).add(userAndReportedUser[1]);
            }
            reportCount.put(userAndReportedUser[1],
                           reportCount.getOrDefault(userAndReportedUser[1], 0) + 1);
        }
        // System.out.println("reportUser : " + reportUser);
        // System.out.println("reportCount : " + reportCount);
        
        int answerIdx = 0;
        for(String id : id_list) {
            ArrayList<String> reported = reportUser.get(id);
            
            if(reported == null) {
                answerIdx++;
                continue;
            }
            
            for(int r = 0; r < reported.size(); r++) {
                if(reportCount.get(reported.get(r)) != null && reportCount.get(reported.get(r)) >= k) {
                    answer[answerIdx]++;
                }
            }
            answerIdx++;
        }
        
        return answer;
    }
}