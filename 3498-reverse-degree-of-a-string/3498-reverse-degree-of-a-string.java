class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        int n = s.length();
        char[] arr = new char[n];
        arr=s.toCharArray();
        for(int i=0;i<n;i++){
            int c = 'z'-arr[i];
            sum+=((c+1)*(i+1));
        }
        return sum;
    }
}