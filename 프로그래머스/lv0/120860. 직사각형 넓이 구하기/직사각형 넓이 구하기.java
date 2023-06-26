class Solution {
    public int solution(int[][] dots) {
        double width = 0;
        double hight = 0;
        for(int i = 1; i < dots.length; i++) {
            if (dots[0][0] == dots[i][0]) {
                hight = Math.pow(dots[i][0]-dots[0][0], 2) + Math.pow(dots[i][1]-dots[0][1], 2);
            }
            else if (dots[0][1] == dots[i][1]) {
                width = Math.pow(dots[i][0]-dots[0][0], 2) + Math.pow(dots[i][1]-dots[0][1], 2);
            }
        }
        
        return (int)(Math.sqrt(width) * Math.sqrt(hight));
    }
}