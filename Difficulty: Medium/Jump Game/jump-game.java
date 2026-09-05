class Solution {
    public boolean canReach(int[] arr) {
        // code here
        int maxR=0;
        
        for(int i=0;i<arr.length;i++){
            if(i>maxR) return false;
            maxR=Math.max(maxR,i+arr[i]);
        }
        
        return true;
        
    }
}