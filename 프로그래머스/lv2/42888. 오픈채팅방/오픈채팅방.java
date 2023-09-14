import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> recordMap = new HashMap<String, String>();
        for(String rc : record) {
            String[] rcArr = rc.split(" ");
            if(rcArr[0].equals("Enter") || rcArr[0].equals("Change")) {
                recordMap.put(rcArr[1], rcArr[2]);
            }
        }
        // System.out.println(recordMap);
        
        ArrayList<String> result = new ArrayList<String>();
        StringBuilder recordPrint = new StringBuilder();
        for(String rc : record) {
            String[] rcArr = rc.split(" ");
            recordPrint.setLength(0);
            recordPrint.append(recordMap.get(rcArr[1]));
            if(rcArr[0].equals("Enter")) {
                recordPrint.append("님이 들어왔습니다.");
            }
            else if(rcArr[0].equals("Leave")) {
                recordPrint.append("님이 나갔습니다.");
            }
            else { 
                continue;
            }
            result.add(recordPrint.toString());
        }
        // System.out.println(result);
        
        String[] answer = new String[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}