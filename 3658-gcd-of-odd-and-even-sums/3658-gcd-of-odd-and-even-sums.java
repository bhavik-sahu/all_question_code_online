class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumO=0,sumE=0;
        // for(int i=1;i<=n*2;i++){
        //     if(i%2==0)sumO+=i;
        //     else sumE+=i;
        // }
        sumE=n*n;
        sumO=n*(n+1);
        int temp;
        int a = sumO,b=sumE;
        while(b!=0){
            temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }
}