import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        HashSet<String> road = new HashSet<String>();
        
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
            
            visitedRoad(characterLoc[0], characterLoc[1], dx, dy, road);
            visitedRoad(dx, dy, characterLoc[0], characterLoc[1], road);
            
            characterLoc[0] = dx;
            characterLoc[1] = dy;
            
        }
        
        return road.size()/2;
    }
    
    public static void visitedRoad(int px, int py, int cx, int cy, HashSet<String> road) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(px);
        sb.append(py);
        sb.append(cx);
        sb.append(cy);
        road.add(sb.toString());
    }
}