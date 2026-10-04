class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> s = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        Object[] recn= s.toArray();
        for(int i =0;i<recn.length;i++){
            nums[i]=(int)recn[i];
        }
        return s.size();
    }
}