class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        List<List<Integer>> grps = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int id =-1;

        for(int i=0;i<sorted.length;i++){
            if(i==0 || sorted[i]-sorted[i-1]>limit){
                grps.add(new ArrayList<>());
                id++;
            }
            grps.get(id).add(sorted[i]);
            map.put(sorted[i],id);
        }
        int[] idx = new int[grps.size()];

        for(int i=0;i<nums.length;i++){
            int cur = map.get(nums[i]);
            nums[i] = grps.get(cur).get(idx[cur]);
            idx[cur]++;
        }
        return nums;
    }
}