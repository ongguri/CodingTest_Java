class Solution {
    public int solution(int[][] sizes) {
        int sizesLen = sizes.length;
        int[] widthArr = new int[sizesLen], heightArr = new int[sizesLen];
        
        for(int i = 0; i < sizesLen; i++) {
            widthArr[i] = Math.min(sizes[i][0], sizes[i][1]);
            heightArr[i] = Math.max(sizes[i][0], sizes[i][1]);
        }
        
        int width = 0, height = 0;
        for(int i = 0; i < sizesLen; i++) {
            width = Math.max(width, widthArr[i]);
            height = Math.max(height, heightArr[i]);
        }
        
        return width * height;
    }
}