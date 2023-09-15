import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        HashSet<String> road = new HashSet<String>();
        StringBuilder sb = new StringBuilder();
        
        int[] characterLoc = {0, 0};
        for(char dir : dirs.toCharArray()) {
            int dx = characterLoc[0];
            int dy = characterLoc[1];
            if(dir == 'U') { dy++; }
            else if(dir == 'D') { dy--; }
            else if(dir == 'R') { dx++; }
            else if(dir == 'L') { dx--; }
            
            if(Math.abs(dx) > 5 || Math.abs(dy) > 5) {
                continue;
            }
            sb.append(characterLoc[0]);
            sb.append(characterLoc[1]);
            sb.append(dx);
            sb.append(dy);
            road.add(sb.toString());
            sb.setLength(0);
            
            sb.append(dx);
            sb.append(dy);
            sb.append(characterLoc[0]);
            sb.append(characterLoc[1]);
            road.add(sb.toString());
            sb.setLength(0);
            
            characterLoc[0] = dx;
            characterLoc[1] = dy;
            
        }
        
        return road.size()/2;
    }
}