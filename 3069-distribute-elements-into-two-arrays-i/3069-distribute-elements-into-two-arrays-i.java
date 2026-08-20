class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int n = nums.length;
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i = 2;
        while(i<n){
            int f = arr1.size();
            int s = arr2.size();
            if(arr1.get(f-1)>arr2.get(s-1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);

            }
            i++;
        }

 arr1.addAll(arr2);
int[] ans = new int[arr1.size()];

for (int j = 0; j < arr1.size(); j++) {
    ans[j] = arr1.get(j);
}
 return ans;
    }
}