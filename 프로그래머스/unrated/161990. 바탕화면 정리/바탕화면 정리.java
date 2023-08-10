class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {wallpaper.length, wallpaper[0].length(), -1, -1};
        
        for(int x = 0; x < wallpaper.length; x++) {
            for(int y = 0; y < wallpaper[0].length(); y++) {
                if(wallpaper[x].charAt(y) == '#') {
                    if(answer[0] == wallpaper.length) {
                        answer[0] = x;
                    }
                    answer[1] = Math.min(answer[1], y);
                    answer[2] = Math.max(answer[2], x+1);
                    answer[3] = Math.max(answer[3], y+1);
                }
            }
        }
        
        return answer;
    }
}