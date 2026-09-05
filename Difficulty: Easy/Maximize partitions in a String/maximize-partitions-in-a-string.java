class Solution {
    public int maxPartitions(String s) {
        // code here
        int[] last=new int[26];
        
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        
        int start=0;
        int end=0;
        int c=0;
        
        for(int i=0;i<s.length();i++){
            end=Math.max(end,last[s.charAt(i)-'a']);
            
            if(i==end){
                c++;
                start=i+1;
            }
        }
        
        return c;
    }
}