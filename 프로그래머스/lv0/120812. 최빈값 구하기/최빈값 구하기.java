class Solution {
    public int solution(int[] array) {
        int maxInd = 0, len = 1000;
        int[] count = new int[len];
        
		for(int i = 0; i < array.length; i++) {
			count[array[i]] += 1;
		}  // array 원소를 인덱스번호로 생각하고 해당 count 인덱스에 array 원소를 더함
		
		
		for(int i = 0; i < len; i++) {
			if(count[i] != 0) {
				if(count[maxInd] <= count[i]) {
					maxInd = i;
				}
			}
		}
		
		for(int i = 0; i < len; i++) {
			if(count[i] ==  0 || i == maxInd) continue; // 0은 취급 안함
			if(count[i] == count[maxInd]) {
                maxInd = -1;
                break;
            }
		}
        return maxInd;
    }
}