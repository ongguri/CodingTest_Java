class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int dayCount = 0;
        for(int m = 1; m < a; m++) {
            switch(m) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dayCount += 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dayCount += 30;
                    break;
                case 2:
                    dayCount += 29;
                    break;
            }
        }
        
        dayCount += b;
        
        return day[dayCount % 7];
    }
}