class Solution {
    public boolean checkDivisibility(int n) {
        String digits= Integer.toString(n);
        int len = digits.length();
        int[] num = new int[len];
        int sum =0,prod=1;
        for(int i=0;i<len;i++){
            num[i]=digits.charAt(i)-'0';
            sum+=num[i];
            prod*=num[i];
        }
        int total = sum +prod;
        if(n%total==0)return true;
        else return false;
    }
}