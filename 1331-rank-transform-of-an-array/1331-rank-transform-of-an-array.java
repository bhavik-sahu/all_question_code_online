class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> rankofnum = new HashMap<>();
        int n = arr.length;
        TreeSet<Integer> nums = new TreeSet<>();
        for(int num:arr)nums.add(num);
        int rank =1;
        for(int num:nums){
            rankofnum.put(num,rank);
            rank++;
        }
        for(int i=0;i<n;i++){
            arr[i]=rankofnum.get(arr[i]);
        }
        return arr;
    }
}