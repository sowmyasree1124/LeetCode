class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int n=x;
        if(x<0){
            return false;
        }
        while(n!=0){
        int digit=n%10;
        sum=sum*10+digit;
        n=n/10;}
        if(x==sum){
            return true;
        }
        else{
            return false;}
        }
}