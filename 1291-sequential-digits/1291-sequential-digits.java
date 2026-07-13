class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for(int start =1;start<=9;start++){
        int n =start;
            for(int i = start+1;i<=9;i++){
                 n = n*10 + i;
                if(n>=low && n<=high){
                    ans.add(n);
                }
            }
        }
        Collections.sort(ans);
        return ans;

    }
}