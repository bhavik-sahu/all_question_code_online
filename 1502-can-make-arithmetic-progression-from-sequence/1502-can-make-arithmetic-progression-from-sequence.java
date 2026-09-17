class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n =arr.length;
            int k = Math.abs(arr[1]-arr[0]);
        for(int i =2 ;i<n;i++){
            if(Math.abs(arr[i]-arr[i-1])!=k)return false;
        }
        return true;
    }
}