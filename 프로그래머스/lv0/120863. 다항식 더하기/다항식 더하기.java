class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x_num = 0;
        int num = 0;
        String[] polyList = polynomial.split(" [+] ");
        for(String poly : polyList) {
            if(poly.substring(poly.length()-1, poly.length()).equals("x")){
                if(poly.equals("x")) {
                    x_num++;
                    continue;
                }
                x_num += Integer.parseInt(poly.substring(0, poly.length()-1));
            }
            else {
                num += Integer.parseInt(poly);
            }
        }
        
        if(num == 0) {
            if(x_num == 1) {
                return "x";
            }
            return Integer.toString(x_num) + "x";
        }
        else if(x_num == 0) {
            return Integer.toString(num);
        }
        else {
            if(x_num == 1) {
                return "x + " + Integer.toString(num);
            }
            return Integer.toString(x_num) + "x" + " + " + Integer.toString(num);
        }
    }
}