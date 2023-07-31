import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> participantMap = new HashMap<String, Integer>();
        for(String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }
        
        for(String completionName : completion) {
            participantMap.put(completionName, participantMap.get(completionName) - 1);
        }
        
        Iterator<String> result = participantMap.keySet().iterator();
        while(result.hasNext()) {
            String name = result.next();
            if(participantMap.get(name) == 1) {
                answer = name;
                break;
            }
        }
        
        return answer;
    }
}