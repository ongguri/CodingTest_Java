class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strList = s.split(" ");
		
		for(int i = 0; i <strList.length; i++) {
			if(strList[i].equals("Z")) {
				answer -= Integer.parseInt(strList[i-1]);
				continue;
			}
			answer += Integer.parseInt(strList[i]);
		}
        return answer;
    }
}