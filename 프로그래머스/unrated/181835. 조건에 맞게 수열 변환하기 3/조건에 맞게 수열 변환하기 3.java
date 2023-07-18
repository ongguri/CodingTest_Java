class Solution {
    public int[] solution(int[] arr, int k) {
        boolean evenOrOdd = (k % 2 == 0) ? true : false;
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = evenOrOdd ? arr[i] + k : arr[i] * k;
        }
        return arr;
    }
}