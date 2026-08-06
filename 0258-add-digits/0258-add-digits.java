class Solution {
    public int addDigits(int num) {
        int length = String.valueOf(num).length();
        if(length<2)return num;
        else{
            int sum =0;
            while(num!=0){
                int k = num%10;
                num = num/10;
                 sum +=k;
            }
            return addDigits(sum);
        }

           }
}