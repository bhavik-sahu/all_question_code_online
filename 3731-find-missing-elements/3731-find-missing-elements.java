class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int n : nums){
             max = Math.max(max, n);
             min = Math.min(min,n);
            st.add(n);
           }
        for(int i=min+1;i<max;i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}