class Solution {
    public int maxRepeating(String sequence, String word) {
        String temp=word ;
        int cnt=0;
        while(true){

        if(sequence.contains(temp)){
            temp+=word;
            cnt++;
        }
        else break;
        }
        return cnt;
    }
}