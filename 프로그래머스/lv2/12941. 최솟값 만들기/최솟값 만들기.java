class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        int len = A.length;
        
        quickSort(A, 0, len-1);
        quickSort(B, 0, len-1);
        
        for(int i = 0; i < len; i++) {
            answer += A[i] * B[len-i-1];
        }
        
        return answer;
    }
    
    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end) { return; }
        int pivot = start;
        int left = start+1;
        int right = end;

        while(left <= right) {
            while(left <= right && arr[left] <= arr[pivot]) {
                left++;
            }
            while(right > start && arr[right] >= arr[pivot]) {
                right--;
            }

            if(left > right) {
                swap(arr, pivot, right);
            }
            else {
                swap(arr, left, right);
            }
        }

        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

}