class Solution {
    public int solution(int[][] sizes) {
        int maxLen = 0;
        int maxHei = 0;
        
        for(int i=0;i<sizes.length;i++)
        {
            int imLen = Math.max(sizes[i][0],sizes[i][1]);
            int imHei = Math.min(sizes[i][0],sizes[i][1]);
            
            maxLen = Math.max(maxLen,imLen);
            maxHei = Math.max(maxHei,imHei);
        }
        return maxLen*maxHei;
    }
       
}