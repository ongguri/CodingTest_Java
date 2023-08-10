import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> runMap = new HashMap<>();
        for(int p = 0; p < players.length; p++) {
            runMap.put(players[p], p);
        }
        // System.out.println(runMap);
        
        for(String call : callings) {
            int rank = runMap.get(call);
            runMap.put(call, rank-1);
            
            String tmp = players[rank];
            players[rank] = players[rank-1];
            players[rank-1] = tmp;
            
            runMap.put(players[rank], rank);
            // System.out.println(runMap);
        }
        
        return players;
    }
}