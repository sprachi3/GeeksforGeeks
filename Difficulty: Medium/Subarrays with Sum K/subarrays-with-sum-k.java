class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int sum=k;
        int curr=0;
        
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int c=0;
        
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            
            
            if(m.containsKey(curr-sum)){
               c+=m.get(curr-sum);
            }
            
            m.put(curr,m.getOrDefault(curr,0)+1);
        }
        
        
        return c;
    }
}