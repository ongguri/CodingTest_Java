class Solution {
    public int solution(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int result = gcd(arr[i-1], arr[i]);
            result = lcm(arr[i-1], arr[i], result);
            arr[i] = result;
        }
        return arr[arr.length-1];
    }
    
    public static int gcd(int num1, int num2) {
        if(num2 == 0) { return num1; }
        return gcd(num2, num1%num2);
    }
    
    public static int lcm(int num1, int num2, int gcd) {
        return (num1*num2)/gcd;
    }
}