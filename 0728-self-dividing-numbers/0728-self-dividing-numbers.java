class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<>();
        for(int i=left;i<=right;i++){
                int temp = i;
            while(temp!=0){
                int div = temp%10;
                if(div==0)break;
                if(i%div!=0)break;
                temp=temp/10;
            }
            if(temp==0)ls.add(i);

        }
        return ls;
    }
}