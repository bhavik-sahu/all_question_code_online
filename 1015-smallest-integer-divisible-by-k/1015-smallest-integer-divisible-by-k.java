class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0|| k%5==0)return -1;
long current =1%k;
int cont=1;
while(current!=0){
    current = (current*10+1)%k;
    cont++;
}
if(current==0)return cont;
return -1;
    }
}