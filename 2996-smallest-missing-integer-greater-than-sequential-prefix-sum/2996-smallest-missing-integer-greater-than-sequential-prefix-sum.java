class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
            int v = nums[0];
        int i =0,j=1,sum=nums[0];
        while(j<n){
            if(nums[j]-nums[i]>1 || nums[j]-nums[i]<1){
                break;
            }
            else{
                i++;
                sum+=nums[j];
                j++;
            }
        }
       Set<Integer> set = new HashSet<>();

for (int num : nums) {
    set.add(num);
}

while (set.contains(sum)) {
    sum++;
}

return sum;
        
    }
}