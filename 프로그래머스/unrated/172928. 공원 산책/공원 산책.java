import java.util.Arrays;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] puppyLoc = {0, 0};
        int[][] moveArr = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};  // 동 서 남 북
        
        for(int line = 0; line < park.length; line++) {
            int start = park[line].indexOf("S");
            if(start != -1) {
                puppyLoc[0] = line;
                puppyLoc[1] = start;
                break;
            }
        } // 시작 위치좌표 찾기.
        // System.out.println("Start : " + Arrays.toString(puppyLoc));
        
        for(String route : routes) {
            int moveCount = route.charAt(2) - '0';
            int[] move = {};
            if(route.charAt(0) == 'E') { move = moveArr[0]; }
            else if(route.charAt(0) == 'W') { move = moveArr[1]; }
            else if(route.charAt(0) == 'S') { move = moveArr[2]; }
            else if(route.charAt(0) == 'N') { move = moveArr[3]; }
            movePuppy(park, puppyLoc, move, moveCount);
        }
        
        return puppyLoc;
    }
    
    public static void movePuppy(String[] park, int[] puppyLoc, int[] move, int moveCount) {
        int nx = puppyLoc[0];
        int ny = puppyLoc[1];
        
        for(int m = 0; m < moveCount; m++) {
            nx += move[0];
            ny += move[1];
            if(nx < 0 || nx >= park.length || ny < 0 || ny >= park[0].length() || park[nx].charAt(ny) == 'X') {
                return;
            }
        }
        puppyLoc[0] = nx;
        puppyLoc[1] = ny;
        
    }
}